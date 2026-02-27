package org.ee.jakarta.hospitalsystem.user.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.ee.jakarta.hospitalsystem.dao.UserDao;
import org.ee.jakarta.hospitalsystem.db.DBConnect;
import org.ee.jakarta.hospitalsystem.entity.User;

import java.io.IOException;

@WebServlet("/userLogin")
public class UserLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        HttpSession session = req.getSession();

        UserDao userDao = new UserDao(DBConnect.getConn());
        User user = userDao.login(email, password);

        if(user != null) {
            session.setAttribute("userObj", user);
            resp.sendRedirect("index.jsp");
        } else {
            session.setAttribute("errorMsg", "Некорректный email или пароль");
            resp.sendRedirect("user_login.jsp");
        }
    }
}
