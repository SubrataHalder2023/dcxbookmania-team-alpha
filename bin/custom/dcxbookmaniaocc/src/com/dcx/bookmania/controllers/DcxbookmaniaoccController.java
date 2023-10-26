/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.dcx.bookmania.controllers;

import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercewebservicescommons.dto.product.ProductWsDTO;
import de.hybris.platform.webservicescommons.cache.CacheControl;
import de.hybris.platform.webservicescommons.cache.CacheControlDirective;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;

import java.util.EnumSet;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dcx.bookmania.facades.DcxbookmaniaProductFacade;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;


@Controller
@Tag(name = "DcxbookmaniaProduct")
@RequestMapping(value = "/{baseSiteId}/dcxbookmaniaproducts")
public class DcxbookmaniaoccController extends CustomBaseController
{

	private static final EnumSet<ProductOption> PRODUCT_OPTIONS_SET = EnumSet.allOf(ProductOption.class);
	private static final String MAX_INTEGER = "2147483647";
	private static final int CATALOG_SIZE = 2;
	private static final int CATALOG_ID_POS = 0;
	private static final int CATALOG_VERSION_POS = 1;
	private static final String COMMA_SEPARATOR = ",";
	private static final Logger LOG = LoggerFactory.getLogger(DcxbookmaniaoccController.class);

	@Resource(name = "dcxbookmaniaProductFacade")
	private DcxbookmaniaProductFacade dcxbookmaniaProductFacade;

	//	@RequestMapping(value = "/{productCode}", method = RequestMethod.GET)
	//	@ResponseBody
	//	public ProductWsDTO getProductCodeString(@PathVariable
	//	final String productCode)
	//	{
	//		return new ProductWsDTO();
	//	}


	@RequestMapping(value = "/{dcxbookmaniaProductCode}", method = RequestMethod.GET)
	@CacheControl(directive = CacheControlDirective.PRIVATE, maxAge = 120)
	@Cacheable(value = "productCache", key = "T(de.hybris.platform.commercewebservicescommons.cache.CommerceCacheKeyGenerator).generateKey(true,true,#dcxbookmaniaProductCode,#fields)")
	@ResponseBody
	@Operation(operationId = "getProduct", summary = "Get product details.", description = "Returns details of a single product according to a product code.")
	@ApiBaseSiteIdParam
	public ProductWsDTO getProduct(@Parameter(description = "Product identifier", required = true)
	@PathVariable
	final String dcxbookmaniaProductCode, @ApiFieldsParam
	@RequestParam(defaultValue = DEFAULT_FIELD_SET)
	final String fields)
	{
		return getDataMapper().map(dcxbookmaniaProductFacade.getDcxbookmaniaProduct(dcxbookmaniaProductCode), ProductWsDTO.class,
				fields);
	}

}





