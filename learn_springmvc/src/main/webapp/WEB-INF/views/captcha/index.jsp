<%--
  Created by IntelliJ IDEA.
  User: yxrsw
  Date: 2017/6/24
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>

</head>
<body>
<table>
    <tr>
        <th>captcha</th>
        <td>
            <input type="text" id="captcha" name="captcha" class="text" maxlength="10" />
            <img id="captchaImage" src="captcha.form"/>
        </td>
    </tr>
</table>
<script language="JavaScript" type="text/javascript">
    // 更换验证码
    $('#captchaImage').click(function()
    {
        console.log("更换验证码！！！");
        $('#captchaImage').attr("src", "captcha.form?timestamp=" + (new Date()).valueOf());
    });
</script>
</body>
</html>
