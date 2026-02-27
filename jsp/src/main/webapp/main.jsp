<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
    <div class="container">
      <jsp:include page="header.jsp" />
      <section>
        <form action="user.jsp" method="post">
          <p>Имя: <input name="username"></p>
          <p>Пол: <br>
            <label for="female" />
            <input type="radio" name="gender" value="Ж" id="female">Женский <br>

            <label for="male" />
            <input type="radio" name="gender" value="М" id="male">Мужской <br>
          </p>

          <p>Страна:
            <select name="country">
              <option value="ru">Россия</option>
              <option>Беларусь</option>
              <option>Казахстан</option>
            </select>
          </p>

          <p>Курс обучения: <br>
            <label for="java">
              <input type="checkbox" value="java" name="courses" id="java"> JAVA <br>
            </label>

            <label for="html">
              <input type="checkbox" value="html" name="courses" id="html"> HTML <br>
            </label>

            <label for="js">
              <input type="checkbox" value="js" name="courses" id="js"> JAVASCRIPT <br>
            </label>
          </p>

          <p><input type="submit" value="Подтвердить"></p>
        </form>
      </section>
      <jsp:include page="footer.jsp" />
    </div>
  </body>
</html>
