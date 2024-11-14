package org.example.tp1ex2.model;

public class Credit {
    private double montantEmprunte;
    private int dureeEnMois;
    private double tauxAnnuel;

    public Credit(double montantEmprunte, int dureeEnMois, double tauxAnnuel) {
        this.montantEmprunte = montantEmprunte;
        this.dureeEnMois = dureeEnMois;
        this.tauxAnnuel = tauxAnnuel;
    }

    public double calculerMensualite() {
        double tauxMensuel = tauxAnnuel / 12;
        return (montantEmprunte * tauxMensuel) / (1 - Math.pow(1 + tauxMensuel, -dureeEnMois));
    }
}

