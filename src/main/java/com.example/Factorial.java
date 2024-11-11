package com.example;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/factorial")
public class Factorial extends HttpServlet {

    private long calculateFactorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String numberParam = request.getParameter("number");
        if (numberParam == null || numberParam.isBlank() || Integer.parseInt(numberParam)==0) {
            response.getWriter().println("<html><body><h1 style=\"color: red\"  >Please provide a valid number.</h1></body></html>");
            return;
        }

        int number = Integer.parseInt(numberParam);
        long factorial = calculateFactorial(number);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Factorial of " +number+" is :"+factorial + "</h1>");
        out.println("</body></html>");
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/plain");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body> in post");
        out.println("<h1> " +  request.getParameter("number")+ "</h1>");
        out.println("</body></html>");
    }
}