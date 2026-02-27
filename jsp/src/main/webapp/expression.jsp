<%--
  Created by IntelliJ IDEA.
  User: Helen
  Date: 2026-02-25
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%
    request.setAttribute("request_name", "Expression Language");
//    out.println(request.getAttribute("request_name"));
  %>
  ${requestScope}
<p>Hello, ${requestScope.request_name}</p>

<%
  session.setAttribute("session_cname", "Start program");
//  out.println(session.getAttribute("session_cname"));
%>

<h4>Program: ${session_cname}</h4>

  <form action="result.jsp">
    <input type="text" name="name1" placeholder="Введите имя">
    <input type="submit" value="Отправить">
  </form>
</body>
</html>
