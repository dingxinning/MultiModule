<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: yxrsw
  Date: 2017/7/19
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Model</title>
</head>
<body>
    <p> Hello ,<c:out value="${name}" /> .</p>
    <p> Your is  <c:out value="${age}" /> years old </p>
</body>
</html>
