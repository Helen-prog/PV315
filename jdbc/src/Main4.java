import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;

public class Main4 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/users";
        String username = "root";
        String password = "123456";
        String folder_path = "E:\\PV315\\jdbc\\src\\";
        String query = "SELECT image_data FROM image_table WHERE image_id = ?";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, 1);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                byte[] image_data = resultSet.getBytes("image_data");
                String image_path = folder_path + "extractedImage.jpg";
                OutputStream outputStream = new FileOutputStream(image_path);
                outputStream.write(image_data);
            } else {
                System.out.println("Изображение не найдено");
            }
        }catch(SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
