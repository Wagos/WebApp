<%-- 
    Document   : project
    Created on : 28.09.2012, 1:34:44
    Author     : Ёжик
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<head>
    <script type="text/javascript" src="<c:url value="/scripts/jquery-1.8.3.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/scripts/jquery.form.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/scripts/MyScript.js"/>"></script>
</head>
<h1><fmt:message key="projects"/></h1>
<%--<form action="SelectProject" method="POST">--%>
    <table id="table" border="1" style="float: left">
        <tr>
            <td><fmt:message key="project.id"/></td>
            <td><fmt:message key="project.name"/></td>
            <td><fmt:message key="project.description"/></td>
        </tr>
        <c:forEach var="project" items="${projects}">
            <tr class="Project">
                <td id="id" ><c:out value="${project.id}"/></td>
                <td id="name"><c:out value="${project.name}"/></td>
                <td id="description"><c:out value="${project.description}"/></td>
                <%--<td><input type="radio" value="${project.id}" name="id" checked=""/>--%>
            </tr>
        </c:forEach>
    </table>
<button class="Project" add>Add</button>
    <br/>
    <%--<input type="submit" name="update" value="<fmt:message key="button.project.update"/>"/>--%>
    <%--<input type="submit" name="delete" value="<fmt:message key="button.project.delete"/>"/>--%>
<%--</form>--%>
<a href="ProjectEditPage"><button><fmt:message key="button.project.add"/></button></a>
<a href="HomePage"><button><fmt:message key="button.back"/></button></a>
