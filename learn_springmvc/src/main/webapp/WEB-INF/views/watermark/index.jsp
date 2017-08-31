<%--
  Created by IntelliJ IDEA.
  User: yxrsw
  Date: 2017/6/23
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/water/mark" method="post" enctype="multipart/form-data">
    <h2>请选择上传的图片</h2>
    <div class="form-group">
        <br>
        <input type="file" name="image" id="image" />
    </div>
    <div class="form-group">
        <br>
        <button class="btn btn-success" type="submit">开始上传</button>
    </div>
</form>
</body>
</html>
