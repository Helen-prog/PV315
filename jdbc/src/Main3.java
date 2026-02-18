import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/users";
        String username = "root";
        String password = "123456";
        String imagePath = "E:\\PV315\\jdbc\\src\\OIP.jpg";
        String query = "insert into image_table(image_data) values(?)";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            FileInputStream fileInputStream = new FileInputStream(imagePath);
            byte[] imageData = new byte[fileInputStream.available()];
            fileInputStream.read(imageData);
            preparedStatement.setBytes(1, imageData);

            int rows = preparedStatement.executeUpdate();
            if (rows > 0) {
                System.out.println("Изображение добавлено успешно");
            }else {
                System.out.println("Изображение не добавлено");
            }

        } catch (SQLException e){
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
