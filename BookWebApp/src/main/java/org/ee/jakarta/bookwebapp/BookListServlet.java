package org.ee.jakarta.bookwebapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/bookList")
public class BookListServlet extends HttpServlet {

    public static final String query = "SELECT * FROM book_data";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try(Connection connection = DriverManager.getConnection("jdbc:mysql:///book", "root", "123456");
            PreparedStatement ps = connection.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            out.println("<html><head><link rel='stylesheet' href='css/style.css'></head><body><div class='list'>");
            out.println("<table><tr><th>Идентификатор книги</th><th>Название книги</th><th>Книжное издание</th><th>Цена книги</th><th>Редактировать</th><th>Удалить</th></tr>");
            while (rs.next()) {
                out.println("<tr>");
                out.println("<td><div>" + rs.getInt(1) + "</div></td>");
                out.println("<td><div>" + rs.getString(2) + "</div></td>");
                out.println("<td><div>" + rs.getString(3) + "</div></td>");
                out.println("<td><div>" + rs.getFloat(4) + "</div></td>");
                out.println("<td><a href='editScreen?id="+rs.getInt(1)+"'>Редактировать</td>");
                out.println("<td><a href='deleteUrl?id="+rs.getInt(1)+"'>Удалить</td></tr>");
            }
            out.println("</table>");
        } catch (SQLException e) {
            e.printStackTrace();
            out.println("<h1>" + e.getMessage() + "</h1>");
        }
        out.println("<br><a href='home.html'>Главная</a>");
        out.println("</div></body></html>");
    }
}
