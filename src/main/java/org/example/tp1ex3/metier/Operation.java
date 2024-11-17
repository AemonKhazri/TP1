package org.example.tp1ex3.metier;

import java.util.ArrayList;
import java.util.List;

public class Operation {
    private List<Produit> produits;

    public Operation() {
        produits = new ArrayList<>();
        // Ajouter quelques produits par défaut
        produits.add(new Produit(1, "cl1", "Clavier", 3000, 10, "Disponible"));
        produits.add(new Produit(2, "so1", "Souris", 2000, 20, "Disponible"));
        produits.add(new Produit(3, "pc1", "PC Portable", 1000000, 5, "Disponible"));
    }

    public List<Produit> afficherProduits() {
        return produits;
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }
}
