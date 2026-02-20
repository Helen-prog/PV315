package org.ee.jakarta.bookwebapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private static final String query = "INSERT INTO book_data(book_title, book_edition, book_price) VALUES (?, ?, ?)";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String bookTitle = req.getParameter("bookName");
        String bookEdition = req.getParameter("bookEdition");
        float bookPrice = Float.parseFloat(req.getParameter("bookPrice"));

        try(Connection connection = DriverManager.getConnection("jdbc:mysql:///book", "root", "123456");
        PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, bookTitle);
            ps.setString(2, bookEdition);
            ps.setFloat(3, bookPrice);
            int rows = ps.executeUpdate();
            out.println("<html><head><link rel='stylesheet' href='css/style.css'></head><body><div class='list'>");
            if (rows == 1) {
                out.println("<h2>Книга зарегистрирована</h2>");
            } else {
                out.println("<h2>Регистрация книги не удалась</h2>");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        out.println("<br><a href='home.html'>Главная</a>");
        out.println("<br><a href='bookList'>Список книг</a>");
        out.println("</div></body></html>");
    }
}
