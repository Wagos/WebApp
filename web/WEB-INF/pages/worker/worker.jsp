<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%--
    Document   : worker
    Created on : 25.09.2012, 17:46:12
    Author     : Ёжик
--%>
<head>
    <script type="text/javascript" src="<c:url value="/scripts/jquery-1.8.3.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/scripts/jquery.form.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/scripts/MyScript.js"/>"></script>
</head>
<h1><fmt:message key="workers"/></h1>

<%--<form method="POST" action="SelectWorker">--%>
    <table id="table" border="1">
        <tr>
            <td><fmt:message key="worker.id"/></td>
            <td><fmt:message key="worker.name"/></td>
            <td><fmt:message key="worker.email"/></td>
            <td><fmt:message key="worker.photo"/></td>
        </tr>
        <jsp:useBean id="workers" scope="request" type="java.util.List"/>
        <c:forEach var="worker" items="${workers}">
            <tr class="Worker">
                <td id="id" >${worker.id}</td>
                <td id="fio" >${worker.fio}</td>
                <td id="email">${worker.email}</td>
                <td id="image"><img  src="data:image/png;base64,${worker.photoBase64()}" width="80" height="80" alt=""/></td>
                <%--<td><input type="radio" value="${worker.id}" name="id" checked="true"/></td>--%>
            </tr>
        </c:forEach>
        <button class="Worker" add>Add</button>
    </table>
    <%--<input type="submit" name="update" value="<fmt:message key="button.worker.update"/>"/>--%>
    <%--<input type="submit" name="delete" value="<fmt:message key="button.worker.delete"/>"/>--%>
<%--</form>--%>
<a href="WorkerEditPage"><button><fmt:message key="button.worker.add"/></button></a>
<a href="HomePage"><button><fmt:message key="button.back"/></button></a>
