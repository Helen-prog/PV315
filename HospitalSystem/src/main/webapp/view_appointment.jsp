<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page import="org.ee.jakarta.hospitalsystem.entity.User" %>
<%@ page import="org.ee.jakarta.hospitalsystem.dao.AppointmentDao" %>
<%@ page import="org.ee.jakarta.hospitalsystem.db.DBConnect" %>
<%@ page import="org.ee.jakarta.hospitalsystem.dao.DoctorDao" %>
<%@ page import="org.ee.jakarta.hospitalsystem.entity.Appointment" %>
<%@ page import="java.util.List" %>
<%@ page import="org.ee.jakarta.hospitalsystem.entity.Doctor" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <jsp:include page="component/allcss.jsp" />
</head>
<body>
<c:if test="${empty userObj}">
  <c:redirect url="user_login.jsp" />
</c:if>
<jsp:include page="component/navbar.jsp" />
<div class="appointment">
  <div class="wrap">
    <h2>Просмотр назначения</h2>

    <table class="table">
      <tr>
        <th>ФИО</th>
        <th>Пол</th>
        <th>Возраст</th>
        <th>Дата назначения</th>
        <th>Диагноз</th>
        <th>Имя врача</th>
        <th>Статус</th>
      </tr>

      <% User user = (User) session.getAttribute("userObj");
        AppointmentDao dao = new AppointmentDao(DBConnect.getConn());
        DoctorDao dao2 = new DoctorDao(DBConnect.getConn());
        List<Appointment> list = dao.getAllAppointmentByLoginUser(user.getId());
        for (Appointment appointment : list) {
          Doctor d = dao2.getDoctorById(appointment.getDoctorId());
      %>
      <tr>
        <td><%= appointment.getFullName() %></td>
        <td><%= appointment.getGender() %></td>
        <td><%= appointment.getAge() %></td>
        <td><%= appointment.getAppointmentDate() %></td>
        <td><%= appointment.getDiseases() %></td>
        <td><%= d.getFullName() %></td>
        <td>
          <% if("В ожидании".equals(appointment.getStatus())){ %>
          <a href="#" class="btn btn-info">В ожидании</a>
          <% } else { %>
          <%= appointment.getStatus() %>
          <% } %>
        </td>
      </tr>
      <% } %>
    </table>
  </div>
</div>
</body>
</html>
