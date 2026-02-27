<%@ page import="org.ee.jakarta.jsp.application.Calculate" %><%--
  Created by IntelliJ IDEA.
  User: Helen
  Date: 2026-02-25
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    for (int i = 2; i < 10; i++) {
        out.println("<p>" + i + "<sup>2</sup>" + " = " + new Calculate().square(i) + "</p>");
    }
%>
</body>
</html>
