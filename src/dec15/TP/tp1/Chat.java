package dec15.TP.tp1;

public class Chat extends Animal{

    public Chat(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void emettreSon() {
        System.out.printf("Le chat %s miaule.\n", getNom());
    }
}
