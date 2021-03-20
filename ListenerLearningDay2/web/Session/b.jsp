<%--
  Created by IntelliJ IDEA.
  User: 75230
  Date: 2021/3/20
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>获取session中的数据</h1>
<%
out.print(session.getAttribute("xxx"));
%>
</body>
</html>
