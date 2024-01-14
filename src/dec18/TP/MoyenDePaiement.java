package dec18.TP;

public abstract class MoyenDePaiement {
    private String nom;

    public MoyenDePaiement(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
