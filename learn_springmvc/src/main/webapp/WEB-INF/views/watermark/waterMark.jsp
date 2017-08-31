<%--
  Created by IntelliJ IDEA.
  User: yxrsw
  Date: 2017/6/23
  Time: 19:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="panel-body">
    <img class="img-responsive img-rounded" src="${pageContext.request.contextPath}${imageUrl }"/>

    <img class="img-responsive img-rounded" src="${pageContext.request.contextPath}${logoImageUrl }"/>
    <a class="btn btn-warning" href="${pageContext.request.contextPath }">返回</a>

</div>
</body>
</html>
