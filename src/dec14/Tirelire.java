package dec14;

public class Tirelire {
    private double montant;

//    public Tirelire(){
//        this.setMontant(0);
//    }

    public double getMontant() {
        return montant;
    }

    private void setMontant(double montant) {
        this.montant = montant;
    }

    public void afficher() {
        String message =  this.getMontant() > 0 ?
                String.format("Vous avez : %.2f € dans votre tirelire.",this.getMontant()) :
                "Vous êtes sans le sou";
        System.out.println(message);
    }

    public void secouer() {
        String message =  this.getMontant() > 0 ? "Bing bing" : "";
        System.out.println(message);
    }

    public void remplir(double ammount) {
        if(ammount > 0) this.setMontant(montant + ammount);
    }

    public void vider(){
        this.setMontant(0);
    }

    public void puiser(double ammount) {
        if(ammount > 0) {
            double remainingAmmount = this.getMontant() - ammount;
            this.setMontant(remainingAmmount > 0 ?
                            remainingAmmount :
                            0);
        }
    }

    public double calculerSolde(double budget) {
        return  budget > 0 ?
                budget - this.getMontant() :
                this.getMontant();
    }
}
