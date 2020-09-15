package com.abhai.mvc.controllers;

import com.abhai.mvc.models.MyModel;
import com.abhai.mvc.models.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mvc")
public class MyController extends HttpServlet {
    private final MyModel mymodel = new MyModel();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = mymodel.getStudent();
        req.setAttribute("Student", student);
//        req.getSession().setAttribute("Student", student);
//        req.getServletContext().setAttribute("Student", student);
        System.out.println("MyController works fine!");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/myView.jsp");
        requestDispatcher.forward(req, resp);
    }
}
