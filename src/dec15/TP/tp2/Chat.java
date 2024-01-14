package dec15.TP.tp2;

public class Chat extends Animal {

    public Chat(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void emettreSon() {
        super.emettreSon();
        System.out.printf("Le chat %s miaule.\n", getNom());
    }
}
