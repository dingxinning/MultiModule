<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yxrsw
  Date: 2017/4/2
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>spittle</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/WEB-INF/css/style.css" />" >
</head>
<body>
    <div>
        <div class="spittleLocation">
            id:<c:out value="${spittle.id}" />
        </div>
        <div class="spittleLocation">
            username:<c:out value="${spittle.username}" />
        </div>
        <div class="spittleLocation">
            password:<c:out value="${spittle.password}" />
        </div>
        <div class="spittleLocation">
            firstName:<c:out value="${spittle.firstName}" />
        </div>
        <div class="spittleLocation">
            lastName:<c:out value="${spittle.lastName}" />
        </div>
        <div class="spittleLocation">
            email:<c:out value="${spittle.email}" />
        </div>
    </div>
</body>
</html>
