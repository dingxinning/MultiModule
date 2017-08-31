
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: yxrsw
  Date: 2017/7/19
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>model map</title>
</head>
<body>
    <table>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>birth</th>
        </tr>
        <tr>
            <td><c:out value="${a.id}" /></td>
            <td><c:out value="${a.name}" /></td>
            <td><c:out value="${a.birth}" /></td>
        </tr>
        <tr>
            <td><c:out value="${b.id}" /></td>
            <td><c:out value="${b.name}" /></td>
            <td><c:out value="${b.birth}" /></td>
        </tr>
    </table>
</body>
</html>
