import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/users";
        String username = "root";
        String password = "123456";

        String withdrawQuery = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
        String depositQuery = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            conn.setAutoCommit(false);
            try {
                PreparedStatement ps1 = conn.prepareStatement(withdrawQuery);
                PreparedStatement ps2 = conn.prepareStatement(depositQuery);
                ps1.setDouble(1, 500.00);
                ps1.setString(2, "account2");
                ps2.setDouble(1, 500.00);
                ps2.setString(2, "account4");
                int row1 = ps1.executeUpdate();
                int row2 = ps2.executeUpdate();
                if(row1 > 0 && row2 > 0){
                    conn.commit();
                    System.out.println("Транзакция успешна");
                } else {
                    conn.rollback();
                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
