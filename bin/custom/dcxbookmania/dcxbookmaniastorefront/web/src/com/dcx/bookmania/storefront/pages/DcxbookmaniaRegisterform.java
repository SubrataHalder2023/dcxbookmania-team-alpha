/**
 *
 */
package com.dcx.bookmania.storefront.pages;

import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;
/**
 * @author saijain
 *
 */
public class DcxbookmaniaRegisterform extends RegisterForm
{
	private String age;
	private String phonenumber;

	/**
	 * @return the age
	 */
	public String getAge()
	{
		return age;
	}

	/**
	 * @param age
	 *               the age to set
	 */
	public void setAge(final String age)
	{
		this.age = age;
	}

	/**
	 * @return the phonenumber
	 */
	public String getPhonenumber()
	{
		return phonenumber;
	}

	/**
	 * @param phonenumber
	 *                       the phonenumber to set
	 */
	public void setPhonenumber(final String phonenumber)
	{
		this.phonenumber = phonenumber;
	}

}
