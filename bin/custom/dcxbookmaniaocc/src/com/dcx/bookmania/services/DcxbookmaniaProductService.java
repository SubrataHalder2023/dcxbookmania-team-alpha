/**
 *
 */
package com.dcx.bookmania.services;

import java.util.List;

import com.dcx.bookmania.core.model.DcxbookmaniaProductModel;


/**
 * @author subhalde
 *
 */
public interface DcxbookmaniaProductService
{
	public DcxbookmaniaProductModel getDcxbookmaniaProduct(final String code);

	public List<DcxbookmaniaProductModel> getDcxbookmaniaProducts();
	/**
	 * @param code
	 * @return
	 */
}
