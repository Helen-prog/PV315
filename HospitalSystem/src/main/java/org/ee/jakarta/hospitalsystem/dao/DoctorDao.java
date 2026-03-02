package org.ee.jakarta.hospitalsystem.dao;

import org.ee.jakarta.hospitalsystem.entity.Doctor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorDao {
    private Connection conn;

    public DoctorDao(Connection conn) {
        this.conn = conn;
    }

    public boolean registerDoctor(Doctor doctor) {
        boolean flag = false;

        try{
            String sql = "insert into doctor(full_name, dob, qualification, specialist, email, mobno, password) values(?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, doctor.getFullName());
            ps.setString(2, doctor.getDob());
            ps.setString(3, doctor.getQualification());
            ps.setString(4, doctor.getSpecialist());
            ps.setString(5, doctor.getEmail());
            ps.setString(6, doctor.getMobNo());
            ps.setString(7, doctor.getPassword());

            int row = ps.executeUpdate();
            if(row == 1) {
                flag = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flag;
    }

    public List<Doctor> getAllDoctors() {
        List<Doctor> doctors = new ArrayList<Doctor>();
        Doctor doctor = null;

        try {
            String sql = "select * from doctor order by id desc";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                doctor = new Doctor();
                doctor.setId(rs.getInt(1));
                doctor.setFullName(rs.getString(2));
                doctor.setDob(rs.getString(3));
                doctor.setQualification(rs.getString(4));
                doctor.setSpecialist(rs.getString(5));
                doctor.setEmail(rs.getString(6));
                doctor.setMobNo(rs.getString(7));
                doctor.setPassword(rs.getString(8));
                doctors.add(doctor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return doctors;
    }

    public Doctor getDoctorById(int id) {
        Doctor doctor = null;

        try{
            String sql = "select * from doctor where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                doctor = new Doctor();
                doctor.setId(rs.getInt(1));
                doctor.setFullName(rs.getString(2));
                doctor.setDob(rs.getString(3));
                doctor.setQualification(rs.getString(4));
                doctor.setSpecialist(rs.getString(5));
                doctor.setEmail(rs.getString(6));
                doctor.setMobNo(rs.getString(7));
                doctor.setPassword(rs.getString(8));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return doctor;
    }

    public boolean updateDoctor(Doctor doctor) {
        boolean flag = false;

        try {
            String sql = "update doctor set full_name=?, dob=?, qualification=?, specialist=?, email=?, mobno=?, password=? where id=?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, doctor.getFullName());
            ps.setString(2, doctor.getDob());
            ps.setString(3, doctor.getQualification());
            ps.setString(4, doctor.getSpecialist());
            ps.setString(5, doctor.getEmail());
            ps.setString(6, doctor.getMobNo());
            ps.setString(7, doctor.getPassword());
            ps.setInt(8, doctor.getId());
            int row = ps.executeUpdate();
            if(row == 1) {
                flag = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flag;
    }

    public boolean deleteDoctor(int id) {
        boolean flag = false;

        try{
            String sql = "delete from doctor where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            int row = ps.executeUpdate();
            if(row == 1) {
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flag;
    }
}
