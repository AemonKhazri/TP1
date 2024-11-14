<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Calculateur de Crédit Bancaire</h1>
<form action="credit-servlet" method="post">
    <label for="montant">Montant emprunté (DT) :</label>
    <input type="number" id="montant" name="montant" step="0.01" required><br><br>

    <label for="duree">Durée (en mois) :</label>
    <input type="number" id="duree" name="duree" required><br><br>

    <label for="taux">Taux annuel (%) :</label>
    <input type="number" id="taux" name="taux" step="0.01" required><br><br>

    <button type="submit">Calculer</button>
</form>

</body>
</html>

