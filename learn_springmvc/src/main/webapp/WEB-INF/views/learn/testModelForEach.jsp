<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: yxrsw
  Date: 2017/7/19
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>testModelForEach</title>
</head>
<body>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>birth</th>
    </tr>
    <c:forEach items="${infos}" var="info">
    <tr>
        <td><c:out value="${info.id}"/></td>
        <td><c:out value="${info.name}"/></td>
        <td><c:out value="${info.birth}"/></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>