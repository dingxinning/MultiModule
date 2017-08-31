<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>index</title>
    <script>
        function Choose(arr) {
            //request.getContextPath()获取当前系统的路径
            document.fm.action='<%=request.getContextPath() %>/book?method='+arr;
            document.fm.submit();
        }
    </script>
</head>
<body>
<h2>Add Book</h2>
<form name="fm" method="post">
    bookname:<input type="text" name="name" id="name">
    author:<input type="text" name="author" id="author">
    <input type="button" value="Add" onclick="Choose('Add')">
    <input type="button" value="Update" onclick="Choose('Update')">
</form>
</body>
</html>