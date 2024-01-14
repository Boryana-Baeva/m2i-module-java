package dec18.TP;

public class Carte extends MoyenDePaiement {
    private String titulaire;
    private String numero;
    private String type;

    public Carte(String nom, String titulaire, String numero, String type) {
        super(nom);
        this.titulaire = titulaire;
        this.numero = numero;
        this.type = type;
    }
}
