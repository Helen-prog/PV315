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
    <c:redirect url="../admin_login.jsp" />
</c:if>

<section class="admin">
    <div class="wrap">
        <h2>Панель администратора</h2>

        <c:if test="${not empty sucMsg}">
            <p class="center text-success fs-3">${sucMsg}</p>
            <c:remove var="sucMsg" scope="session" />
        </c:if>
        <c:if test="${not empty errorMsg}">
            <p class="center text-danger fs-3">${errorMsg}</p>
            <c:remove var="errorMsg" scope="session" />
        </c:if>

        <div class="admin__block">
            <div class="admin__element">
                <img src="../img/admin_1.png" alt="">
                <h3>Врач</h3>
                <p>5</p>
            </div>
            <div class="admin__element">
                <img src="../img/admin_2.png" alt="">
                <h3>Пациенты</h3>
                <p>45</p>
            </div>
            <div class="admin__element">
                <img src="../img/admin_3.png" alt="">
                <h3>Общее</h3>
                <p>456</p>
            </div>
            <div class="admin__element" data-bs-target="#exampleModal" data-bs-toggle="modal">
                <img src="../img/admin_4.png" alt="">
                <h3>Специалист</h3>
                <p>34</p>
            </div>
        </div>
        <!-- Button trigger modal -->
<%--        <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">--%>
<%--            Launch demo modal--%>
<%--        </button>--%>

        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5" id="exampleModalLabel">Специалист</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        ...
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Закрыть</button>
                        <button type="button" class="btn btn-primary">Сохранить</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

</body>
</html>
