
<%--
    Document   : workerEdit
    Created on : 26.09.2012, 10:29:52
    Author     : Ёжик
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>

<s:form action="SaveWorker" method="POST" enctype="multipart/form-data" commandName="worker">
    <s:hidden path="id"/>
    <fmt:message key="worker.name"/>:
    <br/><s:input path="fio"/><br/>
    <s:errors path="fio" cssClass="error" /><br/>
    <fmt:message key="worker.email"/>:
    <br/><s:input path="email"/><br/>
    <s:errors path="email" cssClass="error"/><br/>
    <fmt:message key="worker.photo"/>:
    <br/><input name="image" type="file"><br/>
    <s:errors path="photo" cssClass="error"/><br/>
    <input type="submit" value="<fmt:message key="button.save"/>"/>
</s:form>
<a href="WorkerPage"><button><fmt:message key="button.back"/></button></a>


<%--<s:form action="SaveWorker" method="POST" enctype="multipart/form-data" commandName="worker">--%>
<%--<s:textfield key="worker.name" name="worker.fio"  />--%>
<%--&lt;%&ndash;ФИО:<br>&ndash;%&gt;--%>
<%--&lt;%&ndash;<input type="text" value="${worker.fio}" name="fio"/><br>&ndash;%&gt;--%>
<%--&lt;%&ndash;E-mail:<br>&ndash;%&gt;--%>
<%--&lt;%&ndash;<input type="email" value="${worker.email}" name="email"/>&ndash;%&gt;--%>
<%--<s:textfield key="worker.email" name="worker.email"/>--%>
<%--<s:file  key="worker.photo" name="photo"/>--%>
<%--<s:textfield name="worker.id" cssStyle="visibility: hidden"/>--%>
<%--<s:submit theme="simple" key="button.save"/>--%>
<%--</s:form>--%>
<%--<s:a action="WorkerPage"><button><s:text name="button.back"/></button></s:a><br>--%>


<%--<form action="WorkerEditFormHandler.do" method="POST" enctype="multipart/form-data">--%>
<%--ФИО:<br>--%>
<%--<input type="text" value="${worker.fio}" name="fio"/><br>--%>
<%--<font size=2 color=red>${worker.getErrors("fio")}</font><br>--%>
<%--E-mail:<br>--%>
<%--<input type="email" value="${worker.email}" name="email"/><br>--%>
<%--<font size=2 color=red>${worker.getErrors("email")}</font><br>--%>
<%----%>
<%--Фотография:<br>--%>
<%--<input type="file" value="" name="photo"/><br>--%>
<%--<font size=2 color=red>${worker.getErrors("photo")}</font><br>--%>
<%--<c:choose>--%>
<%--<c:when test="${worker.id eq null}">--%>
<%--<input type="submit" value="Сохранить" name="save"/>--%>
<%--</c:when>--%>
<%--<c:otherwise>--%>
<%--<input type="submit" value="Изменить" name="save"/>--%>
<%--<input type="text" value="${worker.id}" name="id" style="visibility: hidden"/>--%>
<%--</c:otherwise>--%>
<%--</c:choose><br>--%>
<%--</form>--%>
<%--<a href="WorkerPage.action"><button>Назад</button></a>--%>
