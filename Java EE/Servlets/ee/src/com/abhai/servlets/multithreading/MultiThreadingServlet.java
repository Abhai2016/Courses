package com.abhai.servlets.multithreading;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

@WebServlet("/multiThreading")
public class MultiThreadingServlet extends HttpServlet {
    static int i = 0;

    // Every query executes in new thread so we have to synchronized common data
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        synchronized(this) {
            for (int j = 0; j < 1000_000; j++)
                i++;
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        for (int j = 0; j < 2; j++)
            new Thread(() -> {
                try {
                    URLConnection urlConnection = new URL("http://localhost:8080/multiThread").openConnection();
                    urlConnection.getInputStream();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
    }
}
