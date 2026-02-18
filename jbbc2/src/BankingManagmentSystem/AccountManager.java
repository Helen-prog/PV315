package BankingManagmentSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AccountManager {
    private Connection conn;
    private Scanner sc;

    public AccountManager(Connection conn, Scanner sc) {
        this.conn = conn;
        this.sc = sc;
    }

    public void debitMoney(long accountNumber) throws SQLException {
        sc.nextLine();
        System.out.print("Введите сумму: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.print("Введите PIN-код: ");
        String securityPin = sc.nextLine();

        try {
            conn.setAutoCommit(false);
            if (accountNumber != 0) {
                PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM account WHERE account_number = ? AND security_pin = ?");
                preparedStatement.setLong(1, accountNumber);
                preparedStatement.setString(2, securityPin);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    double currentBalance = resultSet.getDouble("balance");
                    if (currentBalance >= amount) {
                        String sql = "UPDATE account SET balance = balance - ? WHERE account_number = ?";
                        PreparedStatement preparedStatement1 = conn.prepareStatement(sql);
                        preparedStatement1.setDouble(1, amount);
                        preparedStatement1.setLong(2, accountNumber);
                        int row = preparedStatement1.executeUpdate();
                        if (row > 0) {
                            System.out.println("РУБЛИ: " + amount + " списаны успешно\n");
                            conn.commit();
                            conn.setAutoCommit(true);
                            return;
                        } else {
                            System.out.println("Транзакция не удалась");
                            conn.rollback();
                            conn.setAutoCommit(true);
                        }
                    } else {
                        System.out.println("Недостаточный баланс!\n");
                    }
                } else {
                    System.out.println("Неверный PIN-код!\n");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.setAutoCommit(true);
    }

    public void creditMoney(long accountNumber) throws SQLException {
        sc.nextLine();
        System.out.print("Введите сумму: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.print("Введите PIN-код: ");
        String securityPin = sc.nextLine();

        try {
            conn.setAutoCommit(false);
            if (accountNumber != 0) {
                PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM account WHERE account_number = ? AND security_pin = ?");
                preparedStatement.setLong(1, accountNumber);
                preparedStatement.setString(2, securityPin);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    String sql = "UPDATE account SET balance = balance + ? WHERE account_number = ?";
                    PreparedStatement preparedStatement1 = conn.prepareStatement(sql);
                    preparedStatement1.setDouble(1, amount);
                    preparedStatement1.setLong(2, accountNumber);
                    int row = preparedStatement1.executeUpdate();
                    if (row > 0) {
                        System.out.println("РУБЛИ: " + amount + " зачислены успешно");
                        conn.commit();
                        conn.setAutoCommit(true);
                        return;
                    } else {
                        System.out.println("Транзакция не удалась");
                        conn.rollback();
                        conn.setAutoCommit(true);
                    }
                } else {
                    System.out.println("Неверный PIN-код!");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.setAutoCommit(true);
    }

    public void transferMoney(long senderAccountNumber) throws SQLException {
        System.out.print("Введите номер счета получателя: ");
        long receiverAccountNumber = sc.nextLong();
        System.out.print("Введите сумму: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.print("Введите PIN-код: ");
        String securityPin = sc.nextLine();
        try {
            conn.setAutoCommit(false);
            if (senderAccountNumber != 0 && receiverAccountNumber != 0) {
                PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM account WHERE account_number = ? AND security_pin = ?");
                preparedStatement.setLong(1, senderAccountNumber);
                preparedStatement.setString(2, securityPin);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    double currentBalance = resultSet.getDouble("balance");
                    if (currentBalance >= amount) {
                        String debitQuery = "UPDATE account SET balance = balance - ? WHERE account_number = ?";
                        String creditQuery = "UPDATE account SET balance = balance + ? WHERE account_number = ?";
                        PreparedStatement creditPreparedStatement = conn.prepareStatement(creditQuery);
                        PreparedStatement debitPreparedStatement = conn.prepareStatement(debitQuery);
                        creditPreparedStatement.setDouble(1, amount);
                        creditPreparedStatement.setLong(2, receiverAccountNumber);
                        debitPreparedStatement.setDouble(1, amount);
                        debitPreparedStatement.setLong(2, senderAccountNumber);
                        int row1 = creditPreparedStatement.executeUpdate();
                        int row2 = debitPreparedStatement.executeUpdate();
                        if (row1 > 0 && row2 > 0) {
                            System.out.println("Транзакция прошла успешно");
                            System.out.println("РУБЛИ: " + amount + " переведено успешно");
                            conn.commit();
                            conn.setAutoCommit(true);
                            return;
                        } else {
                            System.out.println("Транзакция не удалась");
                            conn.rollback();
                            conn.setAutoCommit(true);
                        }
                    } else {
                        System.out.println("Недостаточный баланс");
                    }
                } else {
                    System.out.println("Неверный PIN-код");
                }
            } else {
                System.out.println("Неверный номер счета");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.setAutoCommit(true);
    }

    public void getBalance(long accountNumber) {
        sc.nextLine();
        System.out.print("Введите PIN-код: ");
        String securityPin = sc.nextLine();
        try {
            PreparedStatement preparedStatement = conn.prepareStatement("SELECT balance FROM account WHERE account_number = ? AND security_pin = ?");
            preparedStatement.setLong(1, accountNumber);
            preparedStatement.setString(2, securityPin);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                double balance = resultSet.getDouble("balance");
                System.out.println("Баланс: " + balance);
            } else {
                System.out.println("Неверный PIN-код!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
