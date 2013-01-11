<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
    Document   : setWorkersProject
    Created on : 28.09.2012, 16:47:08
    Author     : Ёжик
--%>


<s:form action="SaveWorkersRole" method="POST" commandName="workersRole">
    <fmt:message key="project"/>:
    <br/>
    <s:select path="project.id" items="${projects}" itemLabel="name" itemValue="id"/>
    <br/>
    <fmt:message key="worker"/>:
    <br/>
    <s:select path="worker.id" items="${workers}" itemLabel="fio" itemValue="id"/>
    <br/>
    <fmt:message key="job"/>:
    <br/>
    <s:select path="roleName.name" items="${roles}" itemLabel="name" itemValue="name"/>
    <br/>
    <input type="submit" value="<fmt:message key="button.save"/>"/>
</s:form>
<a href="WorkersRolesPage"><button><fmt:message key="button.back"/></button></a>
