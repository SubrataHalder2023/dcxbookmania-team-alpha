/**
 *
 */
package com.dcx.bookmania.facades.register;


import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
/**
 * @author subhalde
 *
 */
public interface DcxbookmaniaRegisterFacade
{
	void register(RegisterData registerData) throws UnknownIdentifierException, IllegalArgumentException, DuplicateUidException;
}
