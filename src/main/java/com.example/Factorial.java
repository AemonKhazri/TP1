package com.example;

import java.io.*;

import jakarta.servlet.ServletException;
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


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        String numberParam = request.getParameter("number");
        if (numberParam == null || numberParam.isBlank() || Integer.parseInt(numberParam)<=0) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Please provide a valid number");
            return;
        }

        int number = Integer.parseInt(numberParam);
        long factorial = calculateFactorial(number);


        request.setAttribute("number",number);
        request.setAttribute("factorial",factorial);

      request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}