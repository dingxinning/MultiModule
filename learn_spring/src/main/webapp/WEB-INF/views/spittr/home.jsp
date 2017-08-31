<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yxrsw
  Date: 2017/4/2
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittr JSP</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/WEB-INF/css/style.css" />" >
</head>
<body>
    <h1>Welcome to Spittr(JSP)</h1>
    <a href="<c:url value="/spittle"/>">Spittles</a>
    <a href="<c:url value="/spittle/register"/>">Register</a>
</body>
</html>
