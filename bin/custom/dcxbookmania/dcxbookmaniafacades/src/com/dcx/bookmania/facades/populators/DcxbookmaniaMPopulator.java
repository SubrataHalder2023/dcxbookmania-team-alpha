/**
 *
 */
package com.dcx.bookmania.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.dcx.bookmania.core.model.DcxbookmaniaMerchandiseModel;


/**
 * @author subhalde
 *
 */
public class DcxbookmaniaMPopulator implements Populator<DcxbookmaniaMerchandiseModel, ProductData>
{
	@Override
	public void populate(final DcxbookmaniaMerchandiseModel source, final ProductData target) throws ConversionException
	{
		//		target.setCode(source.getCode());
		//		target.setMtype(source.getType());
		//		target.setMdesign(source.getDesign());
		//		target.setMmaterial(source.getMaterial());
		//		target.setMsize(source.getSize());
	}
}
