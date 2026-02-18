package BankingManagmentSystem;

import java.sql.*;
import java.util.Scanner;

public class Account {
    private Connection conn;
    private Scanner sc;

    public Account(Connection conn, Scanner sc) {
        this.conn = conn;
        this.sc = sc;
    }

    public boolean accountExists(String email) {
        String sql = "select account_number from account where email = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public long openAccount(String email) {
        if (!accountExists(email)) {
            String sql = "INSERT INTO account VALUES (?, ?, ?, ?, ?)";
            sc.nextLine();
            System.out.print("Введите имя: ");
            String fullName = sc.nextLine();
            System.out.print("Введите начальную сумму: ");
            double balance = sc.nextDouble();
            sc.nextLine();
            System.out.print("Введите защитный PIN-код: ");
            String securityPin = sc.nextLine();
            try {
                long accountNumber = generateAccountNumber();
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setLong(1, accountNumber);
                preparedStatement.setString(2, fullName);
                preparedStatement.setString(3, email);
                preparedStatement.setDouble(4, balance);
                preparedStatement.setString(5, securityPin);
                int row = preparedStatement.executeUpdate();
                if (row > 0) {
                    return accountNumber;
                } else {
                    throw new RuntimeException("Создание учетной записи не удалось!");
                }
            } catch (SQLException e) {
                e.printStackTrace();

            }
        }
        throw new RuntimeException("Аккаунт уже существует");
    }

    private long generateAccountNumber() {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select account_number from account order by account_number desc limit 1");
            if (rs.next()) {
                long lastAccountNumber = rs.getLong("account_number");
                return lastAccountNumber + 1;
            } else {
                return 1000100;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 1000100;
        }
    }

    public long getAccountNumber(String email) {
        String sql = "select account_number from account where email = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, email);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return rs.getLong("account_number");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Номер счета не существует");
    }
}
