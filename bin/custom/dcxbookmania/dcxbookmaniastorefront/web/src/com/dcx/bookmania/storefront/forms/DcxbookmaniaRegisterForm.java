/**
 *
 */
package com.dcx.bookmania.storefront.forms;

import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;
/**
 * @author subhalde
 *
 */
public class DcxbookmaniaRegisterForm extends RegisterForm
{
	private String age;
	private String phoneNumber;

	/**
	 *
	 */
	public DcxbookmaniaRegisterForm()
	{
		super();
	}

	/**
	 * @param age
	 * @param phoneNumber
	 */
	public DcxbookmaniaRegisterForm(final String age, final String phoneNumber)
	{
		super();
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

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
	 * @return the phoneNumber
	 */
	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 *                       the phoneNumber to set
	 */
	public void setPhoneNumber(final String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String toString()
	{
		return "DcxbookmaniaRegisterForm [age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}

}



