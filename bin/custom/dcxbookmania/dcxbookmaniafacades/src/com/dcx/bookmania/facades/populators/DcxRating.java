/**
 *
 */
package com.dcx.bookmania.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultVariantProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;


/**
 * @author subhalde
 *
 */
public class DcxRating extends SearchResultVariantProductPopulator
{
	@Override
	public void populate(final SearchResultValueData source, final ProductData target)
	{
		super.populate(source, target);
		final Object obj = this.getValue(source, "rating");
		if (obj != null)
		{
			target.setRating(this.<Double> getValue(source, "rating"));
		}
		else
		{
			target.setRating(0.0);
		}

	}
}

