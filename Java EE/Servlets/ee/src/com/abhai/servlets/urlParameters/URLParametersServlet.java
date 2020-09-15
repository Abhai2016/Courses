package com.abhai.servlets.urlParameters;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/urlParameters")
public class URLParametersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String one = req.getParameter("one");
        String two = req.getParameter("two");
        resp.getWriter().write("<html>" +
                "<head></head>" +
                "<body>" +
                "one = " + one + "two = " + two +
                "<form action='urlParameters', method='post'>" + // with post there is no arguments in url
                "<input type='text' name='one'/>" +
                "<input type='text' name='two'/>" +
                "<input type='submit' name='submit'/>" +
                "</form></body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
