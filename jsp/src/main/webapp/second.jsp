<%--
  Created by IntelliJ IDEA.
  User: Helen
  Date: 2026-02-25
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name = "hello";
    out.println(name);
%>

<%
    session.setAttribute("session_name", "Start Program");
%>

<form action="output.jsp">
    <input type="text" name="name1" placeholder="Введите имя">
    <input type="submit" value="Кнопка">
</form>
</body>
</html>
