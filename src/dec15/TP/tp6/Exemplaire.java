package dec15.TP.tp6;

import java.io.FilterOutputStream;

public class Exemplaire {
    private Oeuvre oeuvre;

    public Exemplaire(Oeuvre oeuvre) {
        this.oeuvre = oeuvre;
        System.out.printf("Nouvel exemplaire -> %s, %s, en %s\n",
                            this.oeuvre.getTitre(),
                            this.oeuvre.getAuteur().getNom(),
                            this.oeuvre.getLangue());
    }

    public Exemplaire(Oeuvre oeuvre, boolean isCopy) {
        this.oeuvre = oeuvre;
        if(isCopy) {
            System.out.printf("Nouvel exemplaire -> %s, %s, en %s\n",
                    this.oeuvre.getTitre(),
                    this.oeuvre.getAuteur().getNom(),
                    this.oeuvre.getLangue());
        } else  {
            System.out.printf("Copie d’un exemplaire de -> %s, %s, en %s\n",
                    this.oeuvre.getTitre(),
                    this.oeuvre.getAuteur().getNom(),
                    this.oeuvre.getLangue());
        }
    }

    public Oeuvre getOeuvre() {
        return oeuvre;
    }

    public String afficher() {
        return String.format("Un exemplaire de %s", oeuvre.afficher());
    }
}
