package dec18;

public final class Sorcier extends Magicien {

    private int nombrePotions;

    public Sorcier(String nom, int niveauDeVie, int niveauMagie, int nombrePotions) {
        super(nom,niveauDeVie,niveauMagie);
        this.nombrePotions = nombrePotions;
    }

    public int getNombrePotions() {
        return nombrePotions;
    }

    public void setNombrePotions(int nombrePotions) {
        this.nombrePotions = nombrePotions;
    }
}