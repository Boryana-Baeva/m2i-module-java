package dec15.TP.tp2;

public class Chien extends Animal {

    public Chien(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void emettreSon() {
        super.emettreSon();
        System.out.printf("Le chien %s aboie.\n", getNom());
    }
}
