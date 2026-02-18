import java.sql.*;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/users";
        String username = "root";
        String password = "123456";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            conn.setAutoCommit(false);
            String sql = "insert into employees(name, job, salary) values(?,?,?)";
            try{
                PreparedStatement ps = conn.prepareStatement(sql);
                Scanner sc = new Scanner(System.in);
                while (true){
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Job: ");
                    String job = sc.nextLine();
                    System.out.print("Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    ps.setString(1, name);
                    ps.setString(2, job);
                    ps.setDouble(3, salary);
                    ps.addBatch();
                    System.out.print("Добавить следующее значение: Y / N");
                    String answer = sc.nextLine();
                    if(answer.toUpperCase().equals("N")){
                        break;
                    }
                }
                ps.executeBatch();
                conn.commit();
                System.out.println("Пакетная обработка прошла успешно");
            } catch (BatchUpdateException ex){
                conn.rollback();
                System.out.println("Ошибка пакетной обработки");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
