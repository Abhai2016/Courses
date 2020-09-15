package com.abhai.servlets.returnStatus;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/returnStatus")
public class StatusServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setStatus(HttpServletResponse.SC_OK);
//        resp.sendRedirect("http://google.com");
//        resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Bad request :P");

//        resp.setHeader("Refresh", "1");
//        System.out.println("Hello after Refresh");
        resp.setHeader("Refresh", "5;URL=https://google.com");
    }
}
