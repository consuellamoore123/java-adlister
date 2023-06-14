package com.codeup.adlister;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/guess")
public class GuessServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            response.sendRedirect(request.getContextPath() + "/guess.jsp");
//        } catch (IOException e) {
//            // Handle or log the exception as needed
//        }
//    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userGuess = Integer.parseInt(request.getParameter("guess"));
        int randomNumber = (int) (Math.random() * 3) + 1;

        try {
            if (userGuess == randomNumber) {
                response.sendRedirect(request.getContextPath() + "/correct.jsp");
            } else {
                response.sendRedirect(request.getContextPath() + "/incorrect.jsp");
            }
        } catch (IOException e) {
            // Handle or log the exception as needed
        }
    }
}




