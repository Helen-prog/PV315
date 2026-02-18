import java.sql.*;

public class Main6 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/users";
        String username = "root";
        String password = "123456";

        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            conn.setAutoCommit(false);
            try{
                Statement stmt = conn.createStatement();
                stmt.addBatch("INSERT INTO employees(name, job, salary) VALUES('Igor', 'HR Manager', 65000.0)");
                stmt.addBatch("INSERT INTO employees(name, job, salary) VALUES('Oleg', 'C++ Developer', 62000.0)");
                stmt.addBatch("INSERT INTO employees(name, job, salary) VALUES('Petr', 'JS Developer', 67000.0)");
                stmt.executeBatch();
                conn.commit();
                System.out.println("Пакетная обработка прошла успешно");
            } catch (BatchUpdateException ex){
                conn.rollback();
                System.out.println("Ошибка пакетной обработка");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
