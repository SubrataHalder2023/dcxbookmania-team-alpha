<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<div class="product-details page-title" style="color:grey ; font-family: Times New Roman; ">
	<ycommerce:testId code="productDetails_productNamePrice_label_${product.code}">
		<div class="name" style="color:red">${fn:escapeXml(product.name)}<span class="sku"style="color:orange">Product_Id - </span><span class="code"style="color:green">${fn:escapeXml(product.code)}</span></div>
	</ycommerce:testId>
	<product:productReviewSummary product="${product}" showLinks="true"/>
</div>

<!-- <style>
	body {
  font-family: sans-serif;
}

p	{
  margin: 0;
  position:relative;
  top:-350px;
  text-align: center;
  font-size: 100px;
  text-shadow: 80px 80px 1px #fff;
}

ul {
 padding-left: 0;
 margin-left: 0;
}

li {
 margin: 0;
 display: block;
 color: #fff;
 background: #333;
 padding: 0.5em;
 text-shadow: 2px 2px 1px #000;
}

li:nth-of-type(7n-6) {
  background: red;
}

li:nth-of-type(7n-5) {
  background: orange;
}

li:nth-of-type(7n-4) {
  background: yellow;
}

li:nth-of-type(7n-3) {
  background: green;
}

li:nth-of-type(7n-2) {
  background: blue;
}

li:nth-of-type(7n-1) {
  background: indigo;
}

li:nth-of-type(7n-0) {
  background: violet;
}
</style> -->
<div class="row">
	<div class="col-xs-10 col-xs-push-1 col-sm-6 col-sm-push-0 col-lg-4">
		<product:productImagePanel galleryImages="${galleryImages}" />
	</div>
	<div class="clearfix hidden-sm hidden-md hidden-lg"></div>
	<div class="col-sm-6 col-lg-8">
		<div class="product-main-info">
			<div class="row">
				<div class="col-lg-6">
					<div class="product-details" style="color:red">
						<product:productPromotionSection product="${product}"/>
						<ycommerce:testId code="productDetails_productNamePrice_label_${product.code}">
							<product:productPricePanel product="${product}" />
						</ycommerce:testId>
						<div class="description" style="color:black">${ycommerce:sanitizeHTML(product.summary)}</div>
                       <%--  <h5>Languages:${product.languages}</h5> --%>
                        
                        <ul>
							<li>Author:${product.author}</li>
							<li>ISBN:${product.isbn}</li>
							<li>No Of Pages:${product.numberOfPages}</li>
							<li>Publisher:${product.publisher}</li>
						  <li>Publication Date:${product.publicationDate}</li>
						</ul>
					</div>
				</div>

				<div class="col-sm-12 col-md-9 col-lg-6">
					<cms:pageSlot position="VariantSelector" var="component" element="div" class="page-details-variants-select">
						<cms:component component="${component}" element="div" class="yComponentWrapper page-details-variants-select-component"/>
					</cms:pageSlot>
					<cms:pageSlot position="AddToCart" var="component" element="div" class="page-details-variants-select">
						<cms:component component="${component}" element="div" class="yComponentWrapper page-details-add-to-cart-component" style="color:violet"/>
					</cms:pageSlot>
				</div>
			</div>
		</div>

	</div>
</div>