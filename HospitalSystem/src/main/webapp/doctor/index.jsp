<%@ page import="org.ee.jakarta.hospitalsystem.entity.Doctor" %>
<%@ page import="org.ee.jakarta.hospitalsystem.dao.DoctorDao" %>
<%@ page import="org.ee.jakarta.hospitalsystem.db.DBConnect" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="../component/allcss.jsp" />
</head>
<body>

<c:if test="${empty doctorObj}">
    <c:redirect url="../doctor_login.jsp" />
</c:if>

<jsp:include page="navbar.jsp" />
<section class="admin">
    <div class="wrap">
        <h2>Панель врача</h2>
        <%
            Doctor d = (Doctor) session.getAttribute("doctorObj");
            DoctorDao dao = new DoctorDao(DBConnect.getConn());
        %>
        <div class="doctor__block">
            <div class="doctor__element">
                <h4>Врач</h4>
                <h3><%= dao.countDoctors() %></h3>
            </div>
            <div class="doctor__element">
                <h4>Назначение</h4>
                <h3><%= dao.countAppointmentByDoctorId(d.getId()) %></h3>
            </div>
        </div>
    </div>
</section>
</body>
</html>
