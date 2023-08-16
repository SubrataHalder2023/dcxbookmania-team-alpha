<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<style>
/*.listItems {
	  display: block;
	  margin-left: 10px;
	  padding: 2rem;
	}
	
	.listItems li {
	  display: flex;
	  position: relative;
	}
	
	.listItems li:not(:last-child) {
	  margin-bottom: 0.5rem;
	}
	
	.listItems li:before {
	  content: "";
	  position: absolute;
	  top: 1.2em;
	  left: -30px;
	  margin-top: -.9em;
	  background: #f69ec4;
	  height: 12px;
	  width: 12px;
	  border-radius: 50%;
	}*/
.listItems {
	list-style-type: none;
	padding: 0;
	margin: 0;
	border: 1px sold #ccc;
	display: flex;
	flex-wrap: wrap;
}

.listItems li {
	flex: 0 0 25%;
	padding: 8px;
	border-bottom: 1px solid #eee;
	box-sizing: border-box;
}

.listItems li:nth-child(even) {
	background-color: #f5f5f5;
}

.product-details {
	font-family: "Dosis", "Courier New", monospace;
	color: green;
}

table {
	border-collapse: collapse;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

table td {
	padding: 8px 6px;
	vertical-align: top;
}
</style>

<div class="product-details page-title"
	style="color: grey; font-family: Times New Roman; margin: 0; position: relative; text-align: center; font-size: 10px; text-shadow: 80px 80px 1px #fff; padding: 1rem;">


	<ycommerce:testId
		code="productDetails_productNamePrice_label_${product.code}">
		<div class="name" style="color: black; font-size: 40px">${fn:escapeXml(product.name)}<span
				class="code" style="color: grey; font-size: 2rem; padding: 1rem;">(${fn:escapeXml(product.code)})</span>
		</div>
	</ycommerce:testId>
</div>
<hr />
<div class="row" style="padding: 2rem">
	<div class="col-xs-10 col-xs-push-1 col-sm-6 col-sm-push-0 col-lg-4">
		<product:productImagePanel galleryImages="${galleryImages}" />
		<div style="padding: 2rem">
			<product:productReviewSummary product="${product}" showLinks="true" />
		</div>
	</div>
	<div class="clearfix hidden-sm hidden-md hidden-lg"></div>
	<div class="col-sm-6 col-lg-8">
		<div class="product-main-info">
			<div class="row">

				<div class="col-lg-6">

					<div class="product-details" style="color: black">

						<product:productPromotionSection product="${product}" />

						<div class="description" style="color: black;font-size:2rem">${ycommerce:sanitizeHTML(product.summary)}</div>

						<div
							style="border-radius: 25px; background: #E0E0FF; padding: 1rem; margin-top: 2rem; margin-bottom: 2rem; width: 10rem; height: 6rem;">

							<ycommerce:testId
								code="productDetails_productNamePrice_label_${product.code}">

								<product:productPricePanel product="${product}" />

							</ycommerce:testId>

						</div>

						<ul class="listItems">

							<li>Author: ${product.author}</li>

							<li>ISBN: ${product.isbn}</li>

							<li>No Of Pages: ${product.numberOfPages}</li>

							<li>Publisher: ${product.publisher}</li>

							<li>Publication Date: ${product.publicationDate}</li>

							<li>Language :${product.language}</li>

							<li>Height: ${product.height}</li>

							<li>Weight: ${product.weight}</li>

							<li>Width: ${product.width}</li>

							<li>Type: ${product.type}</li>

							<li>Rating: ${product.rating}</li>

							<li>Genre: ${product.genre}</li>

							<li>Style: ${product.style}</li>

							<li>Awards: ${product.awards}</li>

							<li>Cover Design :${product.coverDesign}</li>

							<li>Chapter Nos: ${product.chapterNos}</li>

							

							<li>Fonts: ${product.fonts}</li>

							

							<li>Best Seller: ${product.bestSeller}</li>

							<li>Minimum Age: ${product.ageGroup}</li>

							<li>Country: ${product.country}</li>
							<hr/>
							<li>Link: ${product.link}</li>
							<li>ExpressDelivery: ${product.expressDelivery}</li>
							<li>BookKeywords: ${product.bookKeywords}</li>
							<%-- <li>Merchandise: ${product.merchandises}</li> --%>
						</ul>
						<ul><li style="margin:11px 0px 40px 1px;color:orangered;font-size:2rem">Authors Bio: ${product.authorsBio}</li></ul>
						<ul><li style="margin:11px 0px 40px 1px;color:#00008B;font-size:2rem">Subplot: ${product.subPlot}</li></ul>

					</div>

				</div>

				<div class="col-sm-12 col-md-9 col-lg-6">
					<cms:pageSlot position="VariantSelector" var="component"
						element="div" class="page-details-variants-select">
						<cms:component component="${component}" element="div"
							class="yComponentWrapper page-details-variants-select-component"
							style="color:red" />
					</cms:pageSlot>
					<cms:pageSlot position="AddToCart" var="component" element="div"
						class="page-details-variants-select">
						<cms:component component="${component}" element="div"
							class="yComponentWrapper page-details-add-to-cart-component"
							style="color:grey; font-weight:bold" />
					</cms:pageSlot>
				</div>
			</div>
		</div>
	</div>
</div>
