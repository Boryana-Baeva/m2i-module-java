package dec15.TP.tp5;

public class Maison extends Batiment {
    private int nbPieces;

    public Maison() {}

    public Maison(String adresse, int nbPieces) {
        super(adresse);
        this.nbPieces = nbPieces;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    @Override
    public String toString() {
        return "Maison " +
                "T" + nbPieces +
                " située " + getAdresse();
    }
}
