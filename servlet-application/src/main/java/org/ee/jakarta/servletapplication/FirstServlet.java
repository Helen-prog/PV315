package org.ee.jakarta.servletapplication;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("FirstServlet init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Первый сервлет</h1>");
        String param = req.getParameter("param1");
        out.println("<h2>" + param + "</h2>");

        Map<String, String[]> parameterMap = req.getParameterMap();
        parameterMap.entrySet().forEach(e -> out.println("<h3>" + e.getKey() + "=" + Arrays.toString(e.getValue()) + "</h3>"));
    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();
//        out.println("<h2>Логин: " + req.getParameter("login") + "</h2>");
//        out.println("<h2>Пароль: " + req.getParameter("psw") + "</h2>");
        resp.sendRedirect("index.jsp");
    }

    @Override
    public void destroy() {
        System.out.println("FirstServlet destroy");
    }
}
