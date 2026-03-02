package org.ee.jakarta.hospitalsystem.admin.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.ee.jakarta.hospitalsystem.dao.DoctorDao;
import org.ee.jakarta.hospitalsystem.db.DBConnect;
import org.ee.jakarta.hospitalsystem.entity.Doctor;

import java.io.IOException;

@WebServlet("/updateDoctor")
public class UpdateDoctor extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullName = req.getParameter("full_name");
        String dob = req.getParameter("dob");
        String qualification = req.getParameter("qualification");
        String spec = req.getParameter("spec");
        String email = req.getParameter("email");
        String phone = req.getParameter("mobno");
        String password = req.getParameter("password");

        int id = Integer.parseInt(req.getParameter("id"));

        DoctorDao dao = new DoctorDao(DBConnect.getConn());
        Doctor doctor = new Doctor(id, fullName, dob, qualification, spec, email, phone, password);
        HttpSession session = req.getSession();

        if(dao.updateDoctor(doctor)){
            session.setAttribute("sucMsg", "Врач обновлен успешно");
            resp.sendRedirect("admin/doctor.jsp");
        } else {
            session.setAttribute("errorMsg", "Ошибка сервера");
            resp.sendRedirect("admin/doctor.jsp");
        }
    }
}
