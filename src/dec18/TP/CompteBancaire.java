package dec18.TP;

public abstract class CompteBancaire {
    private String titulaire;
    private String numero;
    private double solde;
    private double fraisBancairesAnnuel;
    public final double MONTANT_FRAIS_BANCAIRES = 7.5;


    public CompteBancaire(String titulaire, String numero) {
        this.titulaire = titulaire;
        this.numero = numero;
        this.fraisBancairesAnnuel= 12*MONTANT_FRAIS_BANCAIRES;

    }

    public String getTitulaire() {
        return titulaire;
    }

    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public double getFraisBancairesAnnuel() {
        return fraisBancairesAnnuel;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setFraisBancairesAnnuel(double fraisBancairesAnnuel) {
        this.fraisBancairesAnnuel = fraisBancairesAnnuel;
    }


}
