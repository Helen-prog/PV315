package org.ee.jakarta.hospitalsystem.doctor.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.ee.jakarta.hospitalsystem.dao.DoctorDao;
import org.ee.jakarta.hospitalsystem.db.DBConnect;

import java.io.IOException;

@WebServlet("/doctorChangePassword")
public class DoctorPasswordChange extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int uid = Integer.parseInt(req.getParameter("uid"));
        String oldPassword = req.getParameter("oldPassword");
        String newPassword = req.getParameter("newPassword");

        DoctorDao dao = new DoctorDao(DBConnect.getConn());
        HttpSession session = req.getSession();

        if(dao.checkOldPassword(uid, oldPassword)) {
            if(dao.changePassword(uid, newPassword)) {
                session.setAttribute("sucMsg", "Пароль изменен успешно");
                resp.sendRedirect("doctor/edit_profile.jsp");
            } else {
                session.setAttribute("errorMsg", "Ошибка сервера");
                resp.sendRedirect("doctor/edit_profile.jsp");
            }
        } else {
            session.setAttribute("errorMsg", "Пароль неверный");
            resp.sendRedirect("doctor/edit_profile.jsp");
        }
    }
}
