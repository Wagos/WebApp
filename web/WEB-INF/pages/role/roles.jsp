<%-- 
    Document   : roles
    Created on : 28.09.2012, 1:35:45
    Author     : Ёжик
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1><fmt:message key="roles"/></h1>
<ul>
    <c:forEach var="role" items="${roles}">
        <li>${role.name}</li>
    </c:forEach>
</ul>
<a href="HomePage"><button><fmt:message key="button.back"/></button></a>
