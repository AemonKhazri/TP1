package org.example.tp1ex2;
import jakarta.servlet.ServletException;
import org.example.tp1ex2.controller.CreditController;
import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/credit-servlet")
public class CreditServlet extends HttpServlet {
    private CreditController controller;

    public void init() throws ServletException {
        controller = new CreditController();
    }

//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
//        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
//    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double montant = Double.parseDouble(request.getParameter("montant"));
        int duree = Integer.parseInt(request.getParameter("duree"));
        double taux = Double.parseDouble(request.getParameter("taux"));

        double mensualite = controller.calculerMensualite(montant, duree, taux);

        request.setAttribute("mensualite", mensualite);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    public void destroy() {
    }
}