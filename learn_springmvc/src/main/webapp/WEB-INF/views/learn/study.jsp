<%--
  Created by IntelliJ IDEA.
  User: yxrsw
  Date: 2017/4/25
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Study JSP</title>
</head>
<body>
<%
    out.println("Hello World！");
%>

<%!
    private int initVar = 0;
    private int serviceVar = 0;
    private int destroyVar = 0;
%>

<%!
    public void jspInit() {
        initVar++;
        System.out.println("jspInit(): JSP被初始化了" + initVar + "次");
    }

    public void jspDestroy() {
        destroyVar++;
        System.out.println("jspDestroy(): JSP被销毁了" + destroyVar + "次");
    }
%>

<%
    serviceVar++;
    System.out.println("_jspService(): JSP共响应了" + serviceVar + "次请求");

    String content1 = "初始化次数 : " + initVar;
    String content2 = "响应客户请求次数 : " + serviceVar;
    String content3 = "销毁次数 : " + destroyVar;
%>
<h1>菜鸟教程 JSP 测试实例</h1>
<p><%=content1 %>
</p>
<p><%=content2 %>
</p>
<p><%=content3 %>
</p>

<%
    out.println("Your IP address is " + request.getRemoteAddr());
%>
<%-- 该部分注释在网页中不会被显示--%>
<p>
    今天的日期是: <%= (new java.util.Date()).toLocaleString()%>
</p>

<%! int day = 3; %>

<h3>IF...ELSE 实例</h3>
<% if (day == 1 | day == 7) { %>
<p>今天是周末</p>
<% } else { %>
<p>今天不是周末</p>
<% } %>

<h3>SWITCH...CASE 实例</h3>
<%
    switch (day) {
        case 0:
            out.println("星期天");
            break;
        case 1:
            out.println("星期一");
            break;
        case 2:
            out.println("星期二");
            break;
        case 3:
            out.println("星期三");
            break;
        case 4:
            out.println("星期四");
            break;
        case 5:
            out.println("星期五");
            break;
        default:
            out.println("星期六");
    }
%>

<%! int fontSize; %>
<h3>For 循环实例</h3>
<% for ( fontSize = 1; fontSize <= 3; fontSize++){ %>
<font color="green" size="<%= fontSize %>">
    菜鸟教程
</font><br />
<% } %>

<h3>While 循环实例</h3>
<% fontSize=0; %>
<% while ( fontSize <= 3){ %>
<font color="green" size="<%= fontSize %>">
    菜鸟教程
</font><br />
<% fontSize++;%>
<% } %>
</body>
</html>
