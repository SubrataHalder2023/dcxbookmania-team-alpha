/**
 *
 */
package com.dcx.bookmania.facades.impl;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import com.dcx.bookmania.core.model.DcxbookmaniaProductModel;
import com.dcx.bookmania.facades.DcxbookmaniaProductFacade;
import com.dcx.bookmania.services.DcxbookmaniaProductService;


/**
 * @author subhalde
 *
 */
public class DcxbookmaniaProductFacadeImpl implements DcxbookmaniaProductFacade
{
	private DcxbookmaniaProductService dcxbookmaniaProductService;
	private Converter<DcxbookmaniaProductModel, ProductData> dcxbookmaniaProductConverter;

	public List<ProductData> getDcxbookmaniaProducts()
	{
		final List<DcxbookmaniaProductModel> dcxbookmaniaProductModels = dcxbookmaniaProductService.getDcxbookmaniaProducts();
		return Converters.convertAll(dcxbookmaniaProductModels, getDcxbookmaniaProductConverter());
	}

	@Override
	public ProductData getDcxbookmaniaProduct(final String code)
	{
		final DcxbookmaniaProductModel dcxbookmaniaProductModel = dcxbookmaniaProductService.getDcxbookmaniaProduct(code);
		return getDcxbookmaniaProductConverter().convert(dcxbookmaniaProductModel);
	}

	/**
	 * @param dcxbookmaniaProductService
	 *           the dcxbookmaniaProductService to set
	 */
	public void setDcxbookmaniaProductService(final DcxbookmaniaProductService dcxbookmaniaProductService)
	{
		this.dcxbookmaniaProductService = dcxbookmaniaProductService;
	}

	/**
	 * @param dcxbookmaniaProductConverter
	 *           the dcxbookmaniaProductConverter to set
	 */
	public void setDcxbookmaniaProductConverter(
			final Converter<DcxbookmaniaProductModel, ProductData> dcxbookmaniaProductConverter)
	{
		this.dcxbookmaniaProductConverter = dcxbookmaniaProductConverter;
	}

	public Converter<DcxbookmaniaProductModel, ProductData> getDcxbookmaniaProductConverter()
	{
		return dcxbookmaniaProductConverter;
	}

	public DcxbookmaniaProductService getDcxbookmaniaProductService()
	{
		return dcxbookmaniaProductService;
	}

}
