<%@ page import="org.ee.jakarta.hospitalsystem.dao.SpecialistDao" %>
<%@ page import="org.ee.jakarta.hospitalsystem.db.DBConnect" %>
<%@ page import="org.ee.jakarta.hospitalsystem.entity.Specialist" %>
<%@ page import="java.util.List" %>
<%@ page import="org.ee.jakarta.hospitalsystem.dao.DoctorDao" %>
<%@ page import="org.ee.jakarta.hospitalsystem.entity.Doctor" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="../component/allcss.jsp"/>
</head>
<body>
<jsp:include page="navbar.jsp"/>
<c:if test="${empty doctorObj}">
    <c:redirect url="../doctor_login.jsp"/>
</c:if>


<section class="wrap">
    <h2>Редактирование профиля</h2>
    <c:if test="${not empty sucMsg}">
        <p class="center text-success fs-3">${sucMsg}</p>
        <c:remove var="sucMsg" scope="session"/>
    </c:if>
    <c:if test="${not empty errorMsg}">
        <p class="center text-danger fs-3">${errorMsg}</p>
        <c:remove var="errorMsg" scope="session"/>
    </c:if>


    <div class="row">
        <div class="col-md-4">
            <div class="card point-card">
                <div class="card-body">
                    <form action="../doctorChangePassword" method="post">
                        <div>
                            <label for="old">Введите старый пароль</label>
                            <input type="password" name="oldPassword" class="form-control" id="old" required>
                        </div>
                        <div>
                            <label for="new">Введите новый пароль</label>
                            <input type="password" name="newPassword" class="form-control" id="new" required>
                        </div>
                        <input type="hidden" name="uid" value="${doctorObj.id}">
                        <button class="btn button">Изменить пароль</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-md-8">
            <div class="card point-card">
                <div class="card-body">
                    <form action="../doctorUpdateProfile" method="post">
                        <div class="mb-3">
                            <label for="full" class="form-label">Полное имя</label>
                            <input type="text" name="full_name" id="full" class="form-control" required value="${doctorObj.fullName}">
                        </div>
                        <div class="mb-3">
                            <label for="dob" class="form-label">Дата рождения</label>
                            <input type="date" name="dob" id="dob" class="form-control" required value="${doctorObj.dob}">
                        </div>
                        <div class="mb-3">
                            <label for="special" class="form-label">Специалист</label>
                            <select name="spec" id="special" class="form-control" required>
                                <option value="">${doctorObj.specialist}</option>
                                <%
                                    SpecialistDao dao = new SpecialistDao(DBConnect.getConn());
                                    List<Specialist> list = dao.getAllSpecialist();
                                    for (Specialist s : list) {
                                %>
                                <option><%= s.getSpecialistName() %>
                                </option>
                                <%
                                    }
                                %>
                            </select>
                            <div class="mb-3">
                                <label for="email" class="form-label">Email</label>
                                <input type="email" name="email" id="email" class="form-control" required value="${doctorObj.email}">
                            </div>

                            <div class="mb-3">
                                <label for="tel" class="form-label">Телефон</label>
                                <input type="text" name="mobno" id="tel" class="form-control" required value="${doctorObj.mobNo}">
                            </div>

                            <input type="hidden" name="id" value="${doctorObj.id}">

                            <button class="btn button">Обновить</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>


    </div>
</section>
</body>
</html>
