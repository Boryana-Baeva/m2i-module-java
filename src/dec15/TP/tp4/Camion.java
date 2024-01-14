package dec15.TP.tp4;

public class Camion extends Vehicule{
    public Camion(int anneeModele, double prix) {
        super(anneeModele, prix);
    }

    @Override
    public void demarrer() {
        System.out.printf("Le camion avec plaque d'immatriculation #%d a démarré.\n", getMatricule());
    }

    @Override
    public void accelerer() {
        System.out.printf("La voiture avec plaque d'immatriculation #%d a accéléré.\n", getMatricule());
    }
}
