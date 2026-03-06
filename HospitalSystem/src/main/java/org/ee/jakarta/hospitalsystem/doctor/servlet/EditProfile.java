package org.ee.jakarta.hospitalsystem.doctor.servlet;

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

@WebServlet("/doctorUpdateProfile")
public class EditProfile extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String fullName = req.getParameter("full_name");
        String dob = req.getParameter("dob");
        String spec = req.getParameter("spec");
        String email = req.getParameter("email");
        String phone = req.getParameter("mobno");
        int id = Integer.parseInt(req.getParameter("id"));

        Doctor doctor = new Doctor(id, fullName, dob, spec, email, phone, "");
        DoctorDao dao = new DoctorDao(DBConnect.getConn());
        HttpSession session = req.getSession();

        if(dao.editDoctorProfile(doctor)){
            Doctor updatedDoctor = dao.getDoctorById(id);
            session.setAttribute("sucMsg", "Врач обновлен успешно");
            session.setAttribute("doctorObj", updatedDoctor);
            resp.sendRedirect("doctor/edit_profile.jsp");
        } else {
            session.setAttribute("errorMsg", "Ошибка сервера");
            resp.sendRedirect("doctor/edit_profile.jsp");
        }

    }
}
