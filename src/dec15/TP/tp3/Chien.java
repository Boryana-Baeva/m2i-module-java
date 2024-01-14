package dec15.TP.tp3;

public class Chien extends Animal {
    private String race;

    public Chien(String nom, int age, String race) {
        super(nom, age);
        setRace(race);
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void emettreSon() {
        super.emettreSon();
        System.out.printf("Le chien %s aboie.\n", getNom());
    }

    public void afficherRace() {
        System.out.printf("%s est un %s.\n", getNom(), getRace());
    }
}
