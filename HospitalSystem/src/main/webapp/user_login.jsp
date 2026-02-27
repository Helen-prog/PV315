<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>User Login Page</title>
    <jsp:include page="component/allcss.jsp" />
</head>
<body>
<jsp:include page="component/navbar.jsp" />

<div class="height">
    <section class="form">
        <h2>Авторизация пользователя</h2>

        <c:if test="${not empty sucMsg}">
            <p class="center text-success fs-3">${sucMsg}</p>
            <c:remove var="sucMsg" scope="session" />
        </c:if>
        <c:if test="${not empty errorMsg}">
            <p class="center text-danger fs-3">${errorMsg}</p>
            <c:remove var="errorMsg" scope="session" />
        </c:if>

        <form action="userLogin" method="post">
            <div>
                <label for="email-address">Email:</label>
                <input type="email" class="form-control" name="email" id="email-address" required>
            </div>
            <div>
                <label for="psw">Пароль:</label>
                <input type="password" class="form-control" name="password" id="psw" required>
            </div>

            <button class="btn button">Авторизация</button>
        </form>
        <p class="center">У вас нет аккаунта? <a href="signup.jsp" class="text-decoration-none">Создать аккаунт</a></p>
    </section>
</div>

<jsp:include page="component/footer.jsp" />
</body>
</html>
