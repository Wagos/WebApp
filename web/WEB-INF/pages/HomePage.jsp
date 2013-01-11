<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
    Document   : index
    Created on : 24.09.2012, 17:54:53
    Author     : Ёжик
--%>

<table border="0">
    <tr>
        <td>
            <table border="1" style="float: left">
                <th><fmt:message key="workers"/></th>
                <c:forEach var="row" items="${workers}">
                    <tr>
                        <td><c:out value="${row}"/></td>
                    </tr>
                </c:forEach>
            </table>
            <table border="1" style="float: left">
                <th><fmt:message key="projects"/></th>
                <c:forEach var="row" items="${projects}">
                    <tr>
                        <td><c:out value="${row}"/></td>
                    </tr>
                </c:forEach>
            </table>
        </td>
    </tr>
    <tr>
        <td>
            <a href="WorkerPage"><button><fmt:message key="button.workers_list"/></button></a>
            <a href="ProjectPage"><button><fmt:message key="button.projects_list"/></button></a>
            <a href="RolesPage"><button><fmt:message key="button.roles_list"/></button></a>
            <a href="WorkersRolesPage"><button><fmt:message key="button.workers_roles_list"/></button></a>
        </td>
    </tr>
</table>
