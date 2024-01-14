package dec15.TP.tp6;

public class Oeuvre {
    private String titre;
    private Auteur auteur;
    private String langue;

    public Oeuvre(String titre, Auteur auteur, String langue) {
        this.titre = titre;
        this.auteur = auteur;
        this.langue = langue;
    }

    public Oeuvre(String titre, Auteur auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.langue = "français";
    }

    public String getTitre() {
        return titre;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public String getLangue() {
        return langue;
    }

    public String afficher() {
        return String.format("%s, %s, en %s", getTitre(), getAuteur().getNom(), getLangue());
    }
}
