<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yxrsw
  Date: 2017/4/2
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page isELIgnored="false" %>
<!-- 如果为true，jsp的表达式将被当成字符串处理 -->

<html>
<head>
    <title>spittles</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/WEB-INF/css/style.css" />" >
</head>
<body>
<div class="listTitle">
    <h1>Recent Spittles</h1>
    <ul class="spittleList">
        <c:forEach items="${spittleList}" var="spittle" >
            <li id="spittle_<c:out value="spittle.id"/>">
                <div class="spittleMessage"><c:out value="${spittle.message}" /></div>
                <div>
                    <span class="spittleTime"><c:out value="${spittle.time}" /></span>
                    <span class="spittleLocation">(<c:out value="${spittle.latitude}" />, <c:out value="${spittle.longitude}" />)</span>
                </div>
            </li>
        </c:forEach>
    </ul>
</div>
</body>
</html>
