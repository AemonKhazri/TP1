package org.example.tp1ex2.controller;
import org.example.tp1ex2.model.Credit;






public class CreditController {
    public double calculerMensualite(double montant, int duree, double taux) {
        Credit credit = new Credit(montant, duree, taux);
        return credit.calculerMensualite();
    }
}
