<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <h1>Главная страница</h1>

<%--  <%--%>
<%--    String name = (String) request.getAttribute("name");--%>
<%--    Integer age = (Integer) request.getAttribute("age");--%>

<%--    List<String> nameList = (List<String>) request.getAttribute("nameList");--%>
<%--  %>--%>

<%--  <h3>Name: <%= name %></h3>--%>
<%--  <h3>Age: <%= age %></h3>--%>

<%--  <ul>--%>
<%--    <% for (String s : nameList){ %>--%>
<%--    <li><%= s %></li>--%>
<%--    <% } %>--%>
<%--  </ul>--%>

<%--  <h3>Name: ${name}</h3>--%>
<%--  <h3>Age: ${age}</h3>--%>

<%--  <h3>Name List:</h3>--%>
<%--  <c:forEach items="${nameList}" var="n">--%>
<%--    <li>${n}</li>--%>
<%--    <li><c:out value="${n}"></c:out> </li>--%>
<%--  </c:forEach>--%>

<%--  <a href="login">Login</a>--%>

  <a href="register">Регистрация</a>
  </body>
</html>
