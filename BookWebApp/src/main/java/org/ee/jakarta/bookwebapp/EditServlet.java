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

@WebServlet("/editUrl")
public class EditServlet extends HttpServlet {

    private static final String query = "UPDATE book_data SET book_title=?, book_edition=?, book_price=? WHERE id=?";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        int id = Integer.parseInt(req.getParameter("id"));
        String bookTitle = req.getParameter("bookTitle");
        String bookEdition = req.getParameter("bookEdition");
        float price = Float.parseFloat(req.getParameter("bookPrice"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection("jdbc:mysql:///book", "root", "123456");
             PreparedStatement ps = connection.prepareStatement(query);) {
            ps.setString(1, bookTitle);
            ps.setString(2, bookEdition);
            ps.setFloat(3, price);
            ps.setInt(4, id);
            int rows = ps.executeUpdate();
            out.println("<html><head><link rel='stylesheet' href='css/style.css'></head><body><div class='list'>");
            if(rows == 1) {
                out.println("<h1>Редактирование прошло успешно</h1>");
            } else {
                out.println("<h1>Редактирование не удалось</h1>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            out.println("<h1>" + e.getMessage() + "</h1>");
        }
        out.println("<br><a href='home.html'>Главная</a>");
        out.println("<br><a href='bookList'>Список книг</a>");
        out.println("</div></body></html>");
    }
}
