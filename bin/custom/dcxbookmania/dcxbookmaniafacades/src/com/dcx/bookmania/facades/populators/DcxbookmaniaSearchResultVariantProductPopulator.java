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
public class DcxbookmaniaSearchResultVariantProductPopulator extends SearchResultVariantProductPopulator
{
	@Override
	public void populate(final SearchResultValueData source, final ProductData target)
	{
		super.populate(source, target);
		final Object obj = this.getValue(source, "author");
		if (obj != null)
		{
			target.setAuthor(this.<String> getValue(source, "author"));
		}
		else
		{
			target.setAuthor("Unknown");
		}

	}
}
