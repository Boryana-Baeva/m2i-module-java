package dec18.TP;

import java.util.ArrayList;

public class CompteCourant extends CompteBancaire{
    private ArrayList<MoyenDePaiement> moyenDePaiements;
    private double decouvertMax;
    private final double TAUX_DECOUVERT = 0.09;
    private double fraisDecouvert;
    private boolean hasDecouvert;

    public CompteCourant(String titulaire, String numero, double decouvertMax) {
        super(titulaire, numero);
        this.decouvertMax = decouvertMax;
        this.moyenDePaiements = new ArrayList<>();
    }

    public ArrayList<MoyenDePaiement> getMoyenDePaiements() {
        return moyenDePaiements;
    }

    public double getDecouvertMax() {
        return decouvertMax;
    }

    public double getTAUX_DECOUVERT() {
        return TAUX_DECOUVERT;
    }

    public double getFraisDecouvert() {
        return fraisDecouvert;
    }

    public boolean isHasDecouvert() {
        return hasDecouvert;
    }

    public void addMoyenDePaiement(MoyenDePaiement moyenDePaiements) {
        this.moyenDePaiements.add(moyenDePaiements);
    }

    public void removeMoyenDePaiement(MoyenDePaiement moyenDePaiements) {
        this.moyenDePaiements.remove(moyenDePaiements);
    }

    public void setDecouvertMax(double decouvertMax) {
        this.decouvertMax = decouvertMax;
    }

    public void setFraisDecouvert(double fraisDecouvert) {
        this.fraisDecouvert = fraisDecouvert;
    }

    public void setHasDecouvert(boolean hasDecouvert) {
        this.hasDecouvert = hasDecouvert;
    }
}
