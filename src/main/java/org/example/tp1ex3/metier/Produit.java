package org.example.tp1ex3.metier;

public class Produit {
    private int id;
    private String libelle;
    private String designation;
    private double prix;
    private int quantite;
    private String etat;

    // Constructeurs
    public Produit() {}

    public Produit(int id, String libelle, String designation, double prix, int quantite, String etat) {
        this.id = id;
        this.libelle = libelle;
        this.designation = designation;
        this.prix = prix;
        this.quantite = quantite;
        this.etat = etat;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
