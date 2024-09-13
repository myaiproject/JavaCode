package org.example.makingaservlettutoeial;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "NewServlet " , urlPatterns = "/hello")
public class NewServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        System.out.println("the POST request has been made to /hello");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("the GET request has been made to /hello");

        response.setContentType("text/plain");

        response.getWriter().println("<h1>Hello!</h>");
        response.getWriter().println("<p>Wel come to my website</p>");
    }

}
