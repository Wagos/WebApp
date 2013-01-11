<%--
    Document   : projectAndRoles
    Created on : 28.09.2012, 2:19:56
    Author     : Ёжик
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1><fmt:message key="destinations"/></h1>

<form action="SelectWorkerRole" method="POST">
    <table border="1">
        <tr>
            <td><fmt:message key="worker"/></td>
            <td><fmt:message key="project"/></td>
            <td><fmt:message key="destination"/></td>
        </tr>
        <c:forEach var="wr" items="${workersRoles}">
            <tr>
                <td><c:out value="${wr.worker.fio}"/></td>
                <td><c:out value="${wr.project.name}"/></td>
                <td><c:out value="${wr.roleName.name}"/></td>
                <td><input type="radio" value="${wr.idRole}" name="id" checked="true"/>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" name="delete" value="<fmt:message key="button.unassign"/>"/>
</form>
<a href="WorkersRolesEditPage"><button><fmt:message key="button.assign"/></button></a>
<a href="HomePage"><button><fmt:message key="button.back"/></button></a>

