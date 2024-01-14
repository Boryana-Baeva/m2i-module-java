package dec15.TP.tp6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Bibliotheque {
    private String nom;
    private ArrayList<Exemplaire> exemplaires;

    public Bibliotheque(String nom) {
        this.nom = nom;
        exemplaires = new ArrayList<>();
        System.out.printf("La bibliothèque %s est ouverte !\n", this.nom);
    }

    public String getNom() {
        return nom;
    }

    public int getNbExemplaires() {
        return exemplaires.size();
    }

    public void stocker(Oeuvre oeuvre) {
        exemplaires.add(new Exemplaire(oeuvre));
    }
    public void stocker(Oeuvre oeuvre, int n) {
        for (int i = 0; i < n; i++) {
            exemplaires.add(new Exemplaire(oeuvre));
        }
    }

    public String listerExemplaires(Oeuvre oeuvre, String langue) {
        return "";
    }

    public int compterExemplaires(Oeuvre oeuvre) {
        int count = 0;
        for (Exemplaire exemplaire : exemplaires) {
            if(exemplaire.getOeuvre() == oeuvre) count++;
        }
        return count;
    }

    public String afficherAuteur(boolean isAuteursPrimes) {

        return null;
    }

    public String afficherAuteur() {

        return null;
    }
}
