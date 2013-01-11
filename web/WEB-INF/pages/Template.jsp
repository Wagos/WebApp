
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19.11.12
  Time: 6:22
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value="/styles/styles.css"/>" />
    <title><tiles:insertAttribute name="title"/></title>
</head>
<body>
<table ble border="0">
    <tr>
        <td><tiles:insertAttribute name="header"/></td>
    </tr>
    <tr>
        <td><tiles:insertAttribute name="body"/></td>
    </tr>
    <tr>
        <td><tiles:insertAttribute name="footer"/></td>
    </tr>
</table>
</body>
</html>