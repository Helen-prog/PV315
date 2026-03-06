<%@ page import="org.ee.jakarta.hospitalsystem.entity.Doctor" %>
<%@ page import="org.ee.jakarta.hospitalsystem.dao.AppointmentDao" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="org.ee.jakarta.hospitalsystem.db.DBConnect" %>
<%@ page import="org.ee.jakarta.hospitalsystem.entity.Appointment" %>
<%@ page import="java.util.List" %>
<%@ page import="org.ee.jakarta.hospitalsystem.dao.DoctorDao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="../component/allcss.jsp"/>
</head>
<body>
<jsp:include page="navbar.jsp"/>

<c:if test="${empty adminObj}">
    <c:redirect url="../admin_login.jsp"/>
</c:if>

<section class="doctor">
    <div class="wrap">
        <h2>Данные пациента</h2>

        <table class="table">
            <tr>
                <th>ФИО</th>
                <th>Пол</th>
                <th>Возраст</th>
                <th>Дата назначения</th>
                <th>Email</th>
                <th>Телефон</th>
                <th>Диагноз</th>
                <th>Имя врача</th>
                <th>Адрес</th>
                <th>Статус</th>
            </tr>

            <%
                AppointmentDao dao = new AppointmentDao(DBConnect.getConn());
                DoctorDao dao2 = new DoctorDao(DBConnect.getConn());
                List<Appointment> list = dao.getAllAppointment();
                for(Appointment appointment : list) {
                    Doctor d = dao2.getDoctorById(appointment.getDoctorId());
            %>

            <tr>
                <td><%= appointment.getFullName() %></td>
                <td><%= appointment.getGender() %></td>
                <td><%= appointment.getAge() %></td>
                <td><%= appointment.getAppointmentDate() %></td>
                <td><%= appointment.getEmail() %></td>
                <td><%= appointment.getPhNo() %></td>
                <td><%= appointment.getDiseases() %></td>
                <td><%= d.getFullName() %></td>
                <td><%= appointment.getAddress() %></td>
                <td><%= appointment.getStatus() %></td>
            </tr>

            <% } %>
        </table>
    </div>
</section>

</body>
</html>
