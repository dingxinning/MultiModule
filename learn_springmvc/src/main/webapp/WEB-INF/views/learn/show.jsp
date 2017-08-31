<%--
  Created by IntelliJ IDEA.
  User: yxrsw
  Date: 2017/4/25
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Model</title>
</head>
<body>
    <p>message:<c:out value="${message}" /></p>

    <table>
        <tr>
            <th>id</th>
            <th>姓名</th>
            <th>状态</th>
        </tr>
        <c:forEach items="${people}" var="p">
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.status}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
