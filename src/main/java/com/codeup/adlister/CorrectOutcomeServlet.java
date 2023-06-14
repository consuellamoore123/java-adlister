package com.codeup.adlister;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/correct")
public class CorrectOutcomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setAttribute("outcomeMessage", "You Won!");
            request.getRequestDispatcher("/correct.jsp").forward(request, response);
        } catch (ServletException e) {
            // Handle or log the exception as needed
        }
    }
}

