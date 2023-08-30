/**
 *
 */
package com.dcx.bookmania.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultVariantProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;


/**
 * @author akum1643
 *
 */
public class DcxNumberOfPages extends SearchResultVariantProductPopulator
{

	@Override
	public void populate(final SearchResultValueData source, final ProductData target)
	{
		super.populate(source, target);
		final Object obj = this.getValue(source, "Numbrer Of Pages");
		if (obj != null)
		{
			target.setNumberOfPages(this.<Integer> getValue(source, "Number Of Pages"));
		}
		else
		{
			target.setNumberOfPages(0);
		}

	}
}

