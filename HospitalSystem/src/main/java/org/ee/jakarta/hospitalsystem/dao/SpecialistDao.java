package org.ee.jakarta.hospitalsystem.dao;

import org.ee.jakarta.hospitalsystem.entity.Specialist;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SpecialistDao {
    private Connection conn;

    public SpecialistDao(Connection conn) {
        this.conn = conn;
    }

    public boolean addSpecialist(String spec) {
        boolean flag = false;

        try{
            String sql = "insert into specialist(spec_name) values(?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, spec);
            int row = ps.executeUpdate();
            if (row == 1) {
                flag = true;
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        return flag;
    }
}
