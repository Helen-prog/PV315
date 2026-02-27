package org.ee.jakarta.hospitalsystem.admin.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.ee.jakarta.hospitalsystem.dao.SpecialistDao;
import org.ee.jakarta.hospitalsystem.db.DBConnect;

import java.io.IOException;

@WebServlet("/addSpecialist")
public class AddSpecialist extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String specName = req.getParameter("specName");

        SpecialistDao dao = new SpecialistDao(DBConnect.getConn());
        boolean f = dao.addSpecialist(specName);

        HttpSession session = req.getSession();

        if(f){
            session.setAttribute("sucMsg", "Специалист добавлен");
            resp.sendRedirect("admin/index.jsp");
        } else {
            session.setAttribute("errorMsg", "Ошибка сервера");
            resp.sendRedirect("admin/index.jsp");
        }
    }
}
