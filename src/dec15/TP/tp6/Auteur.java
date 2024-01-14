package dec15.TP.tp6;

public class Auteur {
    private String nom;
    private boolean isPrime;

    public Auteur(String nom, boolean isPrime) {
        this.nom = nom;
        this.isPrime = isPrime;
    }

    public Auteur(String nom) {
        this.nom = nom;
        this.isPrime = false;
    }

    public String getNom() {
        return nom;
    }

    public boolean getPrix() {
        return isPrime;
    }
}
