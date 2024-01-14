package dec15;

public class Magicien extends Personnage{

    private int niveauMagie;

    public Magicien(String nom, int niveauDeVie, int niveauMagie) {
        super(nom,niveauDeVie);
        this.niveauMagie = niveauMagie;
    }

    public int getNiveauMagie() {
        return niveauMagie;
    }

    public void setNiveauMagie(int niveauMagie) {
        this.niveauMagie = niveauMagie;
    }

    @Override
    public void attaquer() {
        System.out.println(getNom() + " lance un sort magique !");
    }

    @Override
    public void seDefendre() {
        System.out.println(getNom() + " se défend !");
    }
}