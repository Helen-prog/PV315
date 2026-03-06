<%@ page import="org.ee.jakarta.hospitalsystem.entity.Doctor" %>
<%@ page import="org.ee.jakarta.hospitalsystem.dao.AppointmentDao" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="org.ee.jakarta.hospitalsystem.db.DBConnect" %>
<%@ page import="org.ee.jakarta.hospitalsystem.entity.Appointment" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
  <jsp:include page="../component/allcss.jsp" />
</head>
<body>
<jsp:include page="navbar.jsp" />

<c:if test="${empty doctorObj}">
  <c:redirect url="../doctor_login.jsp" />
</c:if>

<section class="doctor">
  <div class="wrap">
    <h2>Панель обращений</h2>

    <c:if test="${not empty sucMsg}">
      <p class="center text-success fs-3">${sucMsg}</p>
      <c:remove var="sucMsg" scope="session" />
    </c:if>
    <c:if test="${not empty errorMsg}">
      <p class="center text-danger fs-3">${errorMsg}</p>
      <c:remove var="errorMsg" scope="session" />
    </c:if>

    <table class="table">
      <tr>
        <th>ФИО</th>
        <th>Пол</th>
        <th>Возраст</th>
        <th>Дата назначения</th>
        <th>Email</th>
        <th>Телефон</th>
        <th>Диагноз</th>
        <th>Статус</th>
        <th>Действие</th>
      </tr>
      <%
        Doctor doc = (Doctor) session.getAttribute("doctorObj");
        AppointmentDao dao = new AppointmentDao(DBConnect.getConn());
        List<Appointment> list = dao.getAllAppointmentByDoctorLogin(doc.getId());
        for (Appointment app : list) {
      %>
      <tr>
        <td><%= app.getFullName() %></td>
        <td><%= app.getGender() %></td>
        <td><%= app.getAge() %></td>
        <td><%= app.getAppointmentDate() %></td>
        <td><%= app.getEmail() %></td>
        <td><%= app.getPhNo() %></td>
        <td><%= app.getDiseases() %></td>
        <td><%= app.getStatus() %></td>
        <td>
          <%
            if("В ожидании".equals(app.getStatus())){
          %>
          <a href="comment.jsp?id=<%= app.getId() %>" class="btn btn-sm btn-info">Комментарий</a>
          <% } else { %>
          <a href="#" class="btn btn-sm disabled">Комментарий</a>
          <% } %>
        </td>
      </tr>
      <% } %>
    </table>
  </div>
</section>

</body>
</html>
