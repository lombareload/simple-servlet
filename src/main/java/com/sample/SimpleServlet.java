package com.sample;

// http classes
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// annotation
import javax.servlet.annotation.WebServlet;

// exceptions
import javax.servlet.ServletException;
import java.io.IOException;

import java.io.Writer;

@WebServlet("/simple")
public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Writer writer = response.getWriter();
        writer.write("Hello");
        writer.close();
    }
}
