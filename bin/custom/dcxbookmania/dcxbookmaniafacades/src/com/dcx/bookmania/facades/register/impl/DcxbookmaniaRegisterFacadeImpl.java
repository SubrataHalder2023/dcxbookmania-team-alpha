/**
 *
 */
package com.dcx.bookmania.facades.register.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNullStandardMessage;

import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.user.CustomerModel;

import java.util.UUID;

import org.springframework.util.Assert;

import com.dcx.bookmania.facades.register.DcxbookmaniaRegisterFacade;


/**
 * @author subrata
 *
 */
public class DcxbookmaniaRegisterFacadeImpl extends DefaultCustomerFacade implements DcxbookmaniaRegisterFacade
{
	@Override
	public void register(final RegisterData registerData) throws DuplicateUidException
	{
		validateParameterNotNullStandardMessage("registerData", registerData);
		Assert.hasText(registerData.getFirstName(), "The field [FirstName] cannot be empty");
		Assert.hasText(registerData.getLastName(), "The field [LastName] cannot be empty");
		Assert.hasText(registerData.getLogin(), "The field [Login] cannot be empty");
		Assert.hasText(registerData.getAge(), "The field [Age] cannot be empty");
		Assert.hasText(registerData.getPhoneNumber(), "The field [Phone Number] cannot be empty");

		final CustomerModel newCustomer = getModelService().create(CustomerModel.class);
		setCommonPropertiesForRegister(registerData, newCustomer);
		getCustomerAccountService().register(newCustomer, registerData.getPassword());
	}

	@Override
	public CustomerData nextDummyCustomerData(final RegisterData registerData)
	{
		final CustomerModel userModel = new CustomerModel();
		setCommonPropertiesForRegister(registerData, userModel);
		userModel.setCustomerID(UUID.randomUUID().toString());
		userModel.setAge(registerData.getAge());
		userModel.setPhoneNumber(registerData.getPhoneNumber());
		return getCustomerConverter().convert(userModel);
	}

	@Override
	protected void setCommonPropertiesForRegister(final RegisterData registerData, final CustomerModel customerModel)
	{
		customerModel.setName(getCustomerNameStrategy().getName(registerData.getFirstName(), registerData.getLastName()));
		setTitleForRegister(registerData, customerModel);
		setUidForRegister(registerData, customerModel);
		customerModel.setSessionLanguage(getCommonI18NService().getCurrentLanguage());
		customerModel.setSessionCurrency(getCommonI18NService().getCurrentCurrency());
		customerModel.setAge(registerData.getAge());
		customerModel.setPhoneNumber(registerData.getPhoneNumber());
	}
}