package BankingManagmentSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class User {
    private Connection conn;
    private Scanner sc;

    public User(Connection conn, Scanner sc) {
        this.conn = conn;
        this.sc = sc;
    }

    public boolean user_exist(String email) {
        String sql = "SELECT * FROM user WHERE email = ?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void register(){
        sc.nextLine();
        System.out.print("\nИмя: ");
        String fullName = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();

        if(user_exist(email)) {
            System.out.println("Пользователь с таким адресом электронной почты уже существует");
            return;
        }

        String sql = "INSERT INTO user (full_name, email, password) VALUES (?, ?, ?)";
        try{
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, fullName);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            int row = preparedStatement.executeUpdate();
            if(row > 0) {
                System.out.println("Регистрация прошла успешно");
            } else {
                System.out.println("Регистрация не удалась");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String login() {
        sc.nextLine();
        System.out.print("\nEmail: ");
        String email = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();

        String sql = "SELECT * FROM user WHERE email = ? AND password = ?";

        try{
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next()) {
                return email;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
