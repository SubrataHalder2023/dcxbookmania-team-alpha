/**
 *
 */
package com.dcx.bookmania.dao;

import java.util.List;

import com.dcx.bookmania.core.model.DcxbookmaniaProductModel;


/**
 * @author subhalde
 *
 */
public interface DcxbookmaniaProductDao
{

	/**
	 * @param code
	 * @return
	 */
	public DcxbookmaniaProductModel getDcxbookmaniaProduct(final String code);

	/**
	 * @return
	 */
	public List<DcxbookmaniaProductModel> getDcxbookmaniaProducts();

}
