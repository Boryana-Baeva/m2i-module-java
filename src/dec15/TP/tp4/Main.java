package dec15.TP.tp4;

public class Main {
    public static void main(String[] args) {
        Voiture voiture1 = new Voiture(2017,15000);
        Camion camion1 = new Camion(2020,30000);

        Voiture voiture2 = new Voiture(2022,25000);
        Camion camion2 = new Camion(2015,20000);

        Voiture voiture3 = new Voiture(2019,21000);
        Camion camion3 = new Camion(2013,10000);

        System.out.println(voiture1);
        System.out.println(camion1);

        System.out.println();
        voiture1.demarrer();
        voiture2.accelerer();
        camion2.demarrer();
        camion3.accelerer();
        System.out.println();

        System.out.println(voiture2);
        System.out.println(camion2);

        System.out.println(voiture3);
        System.out.println(camion3);
    }
}
