<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<p><a href="/my-jstl.jsp">JSTL</a></p>
<h3>Изучаем JSP</h3>
<h2>Сегодня: <%= new Date() %></h2>

<%
    String title = "Hello world";
    int len = title.length();

    String header = "Users list";
    String[] people = new String[]{"Tom", "Bob", "Sam"};
%>

<p>Длина строки: <%= title %> = <%= len %>
</p>
<p>Сегодня: <%= new java.util.Date() %>
</p>

<%= header %>
<ul>
    <%
        for (String person : people) {
            out.println("<li>" + person + "</li>");
        }
    %>
</ul>

<p>2 + 2 = <%= 2 + 2 %>
</p>
<p>5 > 2 = <%= 5 > 2 %>
</p>

<%
    for (int i = 0; i < 5; i++) {
        out.println("<br>Hello " + i);
    }
%>

<%!
    int a = 10;
    String name = "jsp";

    int square(int n) {
        return n * n;
    }
%>

<%
    out.println("<br>a: " + a + "<br>");
    out.println("Name: " + name + "<br>");
%>

<p><%=  square(6) %></p>

<ul>
    <%
        for (int i = 1; i <= 5; i++) {
            out.println("<li>" + square(i) + "</li>");
        }
    %>
</ul>
<p><%= Math.random() %></p>
</body>
</html>