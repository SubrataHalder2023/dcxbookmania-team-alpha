/**
 *
 */
package com.dcx.bookmania.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.dcx.bookmania.core.model.DcxbookmaniaProductModel;


/**
 * @author subhalde
 *
 */
public class DcxbookmaniaPopulator implements Populator<DcxbookmaniaProductModel, ProductData>
{
	@Override
	public void populate(final DcxbookmaniaProductModel source, final ProductData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setAuthor(source.getAuthor());
		target.setIsbn(source.getIsbn());
		target.setPublisher(source.getPublisher());
		target.setPublicationDate(source.getPublicationDate());
		target.setLanguage(source.getLanguage());
		target.setNumberOfPages(source.getNumberOfPages());
		target.setHeight(source.getHeight());
		target.setWeight(source.getWeight());
		target.setWidth(source.getWidth());
		target.setType(source.getType());
		target.setRating(source.getRating());
		target.setGenre(source.getGenre());
		target.setStyle(source.getStyle());
		target.setAwards(source.getAwards());
		target.setCoverDesign(source.getCoverDesign());
		target.setChapterNos(source.getChapterNos());
		target.setAuthorsBio(source.getAuthorsBio());
		target.setSales(source.getSales());
		target.setFonts(source.getFonts());
		target.setSubPlot(source.getSubPlot());
		target.setAgeGroup(source.getAgeGroup());
		target.setBestSeller(source.getBestSeller());
		target.setCountry(source.getCountry());
	}
}
