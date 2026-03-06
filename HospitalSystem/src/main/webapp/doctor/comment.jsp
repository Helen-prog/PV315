<%@ page import="org.ee.jakarta.hospitalsystem.dao.AppointmentDao" %>
<%@ page import="org.ee.jakarta.hospitalsystem.db.DBConnect" %>
<%@ page import="org.ee.jakarta.hospitalsystem.entity.Appointment" %>
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
    <h2>Комментарий пациенту</h2>

    <%
      int id = Integer.parseInt(request.getParameter("id"));
      AppointmentDao dao = new AppointmentDao(DBConnect.getConn());
      Appointment ap = dao.getAppointmentById(id);
    %>

    <form action="../updateStatus" method="post" class="row">
      <div class="col-md-6">
        <label for="name">Имя пациента</label>
        <input type="text" class="form-control" id="name" readonly value="<%= ap.getFullName() %>">
      </div>
      <div class="col-md-6">
        <label for="age">Возраст</label>
        <input type="text" class="form-control" id="age" readonly value="<%= ap.getAge() %>">
      </div>
      <div class="col-md-6">
        <label for="phone">Телефон</label>
        <input type="text" class="form-control" id="phone" readonly value="<%= ap.getPhNo() %>">
      </div>
      <div class="col-md-6">
        <label for="diseases">Назначение</label>
        <input type="text" class="form-control" id="diseases" readonly value="<%= ap.getDiseases() %>">
      </div>
      <div class="col-md-12">
        <label for="comment">Комментарий</label>
        <textarea name="comm" id="comment" class="form-control"></textarea>
      </div>
      <input type="hidden" name="id" value="<%= ap.getId() %>">
      <input type="hidden" name="did" value="<%= ap.getDoctorId() %>">
      <div>
        <button class="btn but">Отправить</button>
      </div>
    </form>
  </div>
</section>
</body>
</html>
