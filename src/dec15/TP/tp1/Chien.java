package dec15.TP.tp1;

public class Chien extends Animal{
    public Chien(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void emettreSon() {
        System.out.printf("Le chien %s aboie.\n", getNom());
    }
}
