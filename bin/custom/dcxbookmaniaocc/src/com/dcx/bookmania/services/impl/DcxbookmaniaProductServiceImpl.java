/**
 *
 */
package com.dcx.bookmania.services.impl;

import java.util.List;

import javax.annotation.Resource;

import com.dcx.bookmania.core.model.DcxbookmaniaProductModel;
import com.dcx.bookmania.dao.DcxbookmaniaProductDao;
import com.dcx.bookmania.services.DcxbookmaniaProductService;


/**
 * @author subhalde
 *
 */
public class DcxbookmaniaProductServiceImpl implements DcxbookmaniaProductService
{

	@Resource
	private DcxbookmaniaProductDao dcxbookmaniaProductDao;

	@Override
	public DcxbookmaniaProductModel getDcxbookmaniaProduct(final String code)
	{
		final DcxbookmaniaProductModel dcxbookmaniaProductModel = dcxbookmaniaProductDao.getDcxbookmaniaProduct(code);
		return dcxbookmaniaProductModel;
	}

	@Override
	public List<DcxbookmaniaProductModel> getDcxbookmaniaProducts()
	{
		final List<DcxbookmaniaProductModel> dcxbookmaniaProductModels = dcxbookmaniaProductDao.getDcxbookmaniaProducts();
		return dcxbookmaniaProductModels;
	}

}
