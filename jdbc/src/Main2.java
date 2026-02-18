import java.sql.*;

public class Main2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/users";
        String username = "root";
        String password = "123456";
//        String query = "select * from employees where name = ?";
        String query = "insert into employees values(?,?,?,?)";

        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            preparedStatement.setInt(1, 3);
            preparedStatement.setString(2, "Viktor");
            preparedStatement.setString(3, "Web Developer");
            preparedStatement.setDouble(4, 85000.0);

            int row = preparedStatement.executeUpdate();
            if(row > 0) {
                System.out.println("Данные записаны успешно");
            } else {
                System.out.println("Ошибка сохранения данных");
            }

            //preparedStatement.setString(1, "Sergey");
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String job = resultSet.getString("job");
//                double salary = resultSet.getDouble("salary");
//
//                System.out.println("ID: " + id);
//                System.out.println("Name: " + name);
//                System.out.println("Job: " + job);
//                System.out.println("Salary: " + salary);
//            }
//
//            resultSet.close();
            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
