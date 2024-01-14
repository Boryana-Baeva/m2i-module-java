package dec15.TP.tp3;

public class Chat extends Animal {
    private boolean estIndoor;

    public Chat(String nom, int age, boolean estIndoor) {
        super(nom, age);
        setEstIndoor(estIndoor);
    }

    public boolean getEstIndoor() {
        return estIndoor;
    }

    public void setEstIndoor(boolean estIndoor) {
        this.estIndoor = estIndoor;
    }

    @Override
    public void emettreSon() {
        super.emettreSon();
        System.out.printf("Le chat %s miaule.\n", getNom());
    }

    public void afficherEstIndoor() {
        String msg = getEstIndoor() ? "est" : "n'est pas";
        System.out.printf("%s %s un chat d'intérieur.\n", getNom(), msg);
    }
}
