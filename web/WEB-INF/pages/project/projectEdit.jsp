<%-- 
    Document   : projectEdit
    Created on : 28.09.2012, 1:35:16
    Author     : Ёжик
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>
<%--<title>Project edit</title>--%>
<%--</head>--%>
<%--<body>--%>
<s:form action="SaveProject" method="POST" commandName="project">
    <s:hidden path="id"/>
    <fmt:message key="project.name"/>:
    <br/><s:input path="name"/><br/>
    <s:errors path="name" cssClass="error"/><br/>
    <fmt:message key="project.description"/>:
    <br/><s:textarea path="description"/><br/>
    <s:errors path="description" cssClass="error"/><br/>
    <input type="submit" value="<fmt:message key="button.save"/>"/>
</s:form>
<a href="ProjectPage"><button><fmt:message key="button.back"/></button></a>
<%--<form action="ProjectFormHandler" method="POST">--%>
<%--Название проекта:<br>--%>
<%--<input type="text" value="${project.name}" name="name"/><br>--%>
<%--<font size=2 color=red>${project.getErrors("name")}</font><br>--%>
<%--Описание проекта:<br>--%>
<%--<textarea name="description" rows="7" cols="50">${project.description}</textarea><br>--%>
<%--<font size=2 color=red>${project.getErrors("description")}</font><br>--%>
<%--<c:choose>--%>
<%--<c:when test="${project.id eq null}">--%>
<%--<input type="submit" value="Сохранить" name="save"/>--%>
<%--</c:when>--%>
<%--<c:otherwise>--%>
<%--<input type="submit" value="Изменить" name="save"/>--%>
<%--<input type="text" value="${project.id}" name="id" style="visibility: hidden"/>--%>
<%--</c:otherwise>--%>
<%--</c:choose>--%>
<%--</form>--%>
<%--<a href="ProjectPage.action"><button>Назад</button></a>--%>
<%--</body>--%>
<%--</html>--%>
