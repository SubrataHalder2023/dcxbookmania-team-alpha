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
public class DcxRating implements Populator<SearchResultValueData, ProductData>
{
	@Override
	public void populate(final SearchResultValueData source, final ProductData target) throws ConversionException
		{

		final Double rating = (Double) source.getValues().get("rating");

		if (rating != null)
		{

			target.setRating(rating);
		}

		//		super.populate(source, target);
		//		final Object obj = this.getValue(source, "rating");
		//		if (obj != null)
		//		{
		//			target.setRating(this.<Double> getValue(source, "rating"));
		//		}
		//		else
		//		{
		//			target.setRating(0.0);
		//		}

	}
}

