<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/HomePage" var="eng">
    <c:param name="request_locale" value=""/>
</c:url>
<a href="${eng}">English</a>
<c:url value="/HomePage" var="rus">
    <c:param name="request_locale" value="ru"/>
</c:url>
<a href="${rus}">Русский</a>
