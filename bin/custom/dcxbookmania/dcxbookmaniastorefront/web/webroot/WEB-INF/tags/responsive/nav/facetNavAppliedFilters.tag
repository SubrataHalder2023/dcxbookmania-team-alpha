<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="pageData" required="true" type="de.hybris.platform.commerceservices.search.facetdata.ProductSearchPageData" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<spring:htmlEscape defaultHtmlEscape="true" />

<c:if test="${not empty pageData.breadcrumbs}">

	<div class="facet js-facet">

	<div class="facet__name js-facet-name"style="
    background-color: #FBB917;
    margin: 0px 116px 10px 0px;
    border-radius: 25px;
    font-family: 'Dosis';
    padding: 5px 0 5px 6px;
">
		<span class="glyphicon facet__arrow"></span>
		<spring:theme code="search.nav.applied.facets"/>
	</div>
		<div class="facet__values js-facet-values">
			<ul class="facet__list"style="
    background-color: #89C35C;
    border-radius: 26px !important;
    padding: 0px 0px 0px 0px;
    font-family: 'Dosis';
    font-size: 15px;
    margin: 6px 137px 1px 0px;
">
				<c:forEach items="${pageData.breadcrumbs}" var="breadcrumb">
					<li>
						<c:url value="${breadcrumb.removeQuery.url}" var="removeQueryUrl"/>
						${fn:escapeXml(breadcrumb.facetValueName)}&nbsp;<a href="${fn:escapeXml(removeQueryUrl)}" ><span class="glyphicon glyphicon-remove"></span></a>
					</li>
				</c:forEach>
			</ul>
		</div>
	</div>

</c:if>