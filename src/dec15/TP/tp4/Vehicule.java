package dec15.TP.tp4;

public abstract class Vehicule {
    private int matricule;
    private int anneeModele;
    private double prix;
    private static int nombreVehicules;

    public Vehicule(int anneeModele, double prix) {
        this.anneeModele = anneeModele;
        this.prix = prix;
        nombreVehicules++;
        setMatricule(nombreVehicules);
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public int getAnneeModele() {
        return anneeModele;
    }

    public void setAnneeModele(int anneeModele) {
        this.anneeModele = anneeModele;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }


    public abstract void demarrer();
    public abstract void accelerer();

    @Override
    public String toString() {
        return "Vehicule{" +
                "matricule='" + matricule + '\'' +
                ", anneeModele=" + anneeModele +
                ", prix=" + prix +
                '}';
    }
}
