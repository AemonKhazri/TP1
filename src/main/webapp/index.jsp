<%@ page import="org.example.tp1ex3.metier.Produit" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Gestion de Produits</title>
</head>
<body>
<h1>Gestion de Produits</h1>
<form method="post" action="produits">
    <label>Nom :</label> <input type="text" name="libelle" required /><br>
    <label>Description :</label> <input type="text" name="designation" required /><br>
    <label>Prix :</label> <input type="number" step="0.01" name="prix" required /><br>
    <label>Quantité :</label> <input type="number" name="quantite" required /><br>
    <label>État :</label> <input type="text" name="etat" required /><br>
    <button type="submit">Valider</button>
</form>

<h2>Liste des Produits</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Nom</th>
        <th>Description</th>
        <th>Prix</th>
        <th>Quantité</th>
        <th>État</th>
    </tr>
    <%
        List<Produit> produits = (List<Produit>) request.getAttribute("produits");
        if (produits != null) {
            for (Produit produit : produits) {
    %>
    <tr>
        <td><%= produit.getId() %></td>
        <td><%= produit.getLibelle() %></td>
        <td><%= produit.getDesignation() %></td>
        <td><%= produit.getPrix() %></td>
        <td><%= produit.getQuantite() %></td>
        <td><%= produit.getEtat() %></td>
    </tr>
    <%
            }
        }
    %>
</table>
</body>
</html>
