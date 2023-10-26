 /**
 *
 */
package com.dcx.bookmania.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.dcx.bookmania.core.model.DcxbookmaniaProductModel;
import com.dcx.bookmania.dao.DcxbookmaniaProductDao;

/**
 * @author subhalde
 *
 */
public class DcxbookmaniaProductDaoImpl extends AbstractItemDao implements DcxbookmaniaProductDao
{

	private static final Logger LOGGER = Logger.getLogger(DcxbookmaniaProductDaoImpl.class);
	private static final String DcxbookmaniaProducts_QUERY = "SELECT{" + DcxbookmaniaProductModel.PK + "}FROM{" + DcxbookmaniaProductModel._TYPECODE + "}";
	private static final String DcxbookmaniaProduct_QUERY = "SELECT{" + DcxbookmaniaProductModel.PK + "}FROM{" + DcxbookmaniaProductModel._TYPECODE
			+ "}WHERE{" + DcxbookmaniaProductModel.CODE + "}=?code";

	@Override
	public List<DcxbookmaniaProductModel> getDcxbookmaniaProducts()
	{
		LOGGER.info(getFlexibleSearchService().search(DcxbookmaniaProducts_QUERY).getClass());
		final SearchResult<DcxbookmaniaProductModel> dcxbookmaniaProduct = getFlexibleSearchService()
				.search(DcxbookmaniaProduct_QUERY);
		return dcxbookmaniaProduct.getResult() == null ? Collections.emptyList() : dcxbookmaniaProduct.getResult();
	}

	@Override
	public DcxbookmaniaProductModel getDcxbookmaniaProduct(final String code)
	{
		final Map<String, Object> params = new HashMap<>();
		params.put("code", code);
		LOGGER.info(getFlexibleSearchService().search(DcxbookmaniaProduct_QUERY, params).getClass());
		final SearchResult<DcxbookmaniaProductModel> dcxbookmaniaProduct = getFlexibleSearchService()
				.search(DcxbookmaniaProduct_QUERY, params);
		return dcxbookmaniaProduct.getResult() == null ? null
				: dcxbookmaniaProduct.getResult().get(0);
	}

}
