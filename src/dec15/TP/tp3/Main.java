package dec15.TP.tp3;

public class Main {
    public static void main(String[] args) {
        Chien tommy = new Chien("Tommy", 9, "caniche");
        Chat felix = new Chat("Felix", 5, true);

        tommy.emettreSon();
        felix.emettreSon();
        System.out.println();
        tommy.afficherRace();
        felix.afficherEstIndoor();
    }
}
