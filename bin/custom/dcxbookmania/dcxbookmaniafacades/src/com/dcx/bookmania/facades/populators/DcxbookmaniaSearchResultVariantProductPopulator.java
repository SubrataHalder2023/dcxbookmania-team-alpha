/**
 *
 */
package com.dcx.bookmania.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.apache.commons.lang.StringUtils;


/**
 * @author subhalde
 *
 */
public class DcxbookmaniaSearchResultVariantProductPopulator implements Populator<SearchResultValueData, ProductData>
{
	@Override
	public void populate(final SearchResultValueData source, final ProductData target) throws ConversionException
	{

		final String author = (String) source.getValues().get("author");

		if (StringUtils.isNotEmpty(author))
		{

			target.setAuthor(author);
		}



		//super.populate(source, target);

		//final Object obj = this.getValue(source, "author");
		//		if (obj != null)
		//		{
		//			target.setAuthor(this.<String> getValue(source, "author"));
		//		}
		//		else
		//		{
		//			target.setAuthor("Unknown");


		}

	}
