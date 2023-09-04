/**
 *
 */
package com.dcx.bookmania.facades.register.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNullStandardMessage;

import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.user.CustomerModel;

import org.springframework.util.Assert;

import com.dcx.bookmania.facades.register.dcxbookmaniaRegisterFacade;


/**
 * @author saijain
 *
 */
public class DcxbookmaniaRegisterFacadeImpl extends DefaultCustomerFacade implements dcxbookmaniaRegisterFacade
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
	protected void setCommonPropertiesForRegister(final RegisterData registerData, final CustomerModel customerModel)
	{
		customerModel.setName(getCustomerNameStrategy().getName(registerData.getFirstName(), registerData.getLastName()));
		setTitleForRegister(registerData, customerModel);
		setUidForRegister(registerData, customerModel);
		customerModel.setSessionLanguage(getCommonI18NService().getCurrentLanguage());
		customerModel.setSessionCurrency(getCommonI18NService().getCurrentCurrency());
		customerModel.setAge(registerData.getAge());
		customerModel.setPhonenumber(registerData.getPhoneNumber());
	}
}
