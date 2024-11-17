package org.example.tp1ex3;
import jakarta.servlet.ServletException;
import org.example.tp1ex3.metier.Produit;
import org.example.tp1ex3.metier.Operation;
import java.io.*;
import java.util.List;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet( value = "/produits")
public class ProductServlet extends HttpServlet {
    private Operation operation ;
    @Override
    public void init()throws ServletException {
        operation = new Operation();
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   List<Produit> produits = operation.afficherProduits();
   request.setAttribute("produits",produits);
   request.getRequestDispatcher("index.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String libelle = request.getParameter("libelle");
        String designation = request.getParameter("designation");
        double prix = Double.parseDouble(request.getParameter("prix"));
        int quantite = Integer.parseInt(request.getParameter("quantite"));
        String etat = request.getParameter("etat");


        Produit produit = new Produit(operation.afficherProduits().size() + 1, libelle, designation, prix, quantite, etat);


        operation.ajouterProduit(produit);


        response.sendRedirect("produits");

    }

    public void destroy() {
    }
}