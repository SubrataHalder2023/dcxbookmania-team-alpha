/**
 *
 */
package com.dcx.bookmania.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;


/**
 * @author akum1643
 *
 */
public class DcxNumberOfPages implements Populator<SearchResultValueData, ProductData>
{

	@Override
	public void populate(final SearchResultValueData source, final ProductData target) throws ConversionException
	{
		final Integer numberOfPages = (Integer) source.getValues().get("numberOfPages");

		if (numberOfPages != null)
		{

			target.setNumberOfPages(numberOfPages);
		}
		//		super.populate(source, target);
		//		final Object obj = this.getValue(source, "Numbrer Of Pages");
		//		if (obj != null)
		//		{
		//			target.setNumberOfPages(this.<Integer> getValue(source, "Number Of Pages"));
		//		}
		//		else
		//		{
		//			target.setNumberOfPages(0);
		//		}

	}
}

