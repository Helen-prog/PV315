<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Doctor Login Page</title>
    <jsp:include page="component/allcss.jsp" />
</head>
<body>
<jsp:include page="component/navbar.jsp" />

<div class="height">
    <section class="form">
        <h2>Авторизация врача</h2>
        <form action="docLogin" method="post">
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
    </section>
</div>

<jsp:include page="component/footer.jsp" />
</body>
</html>
