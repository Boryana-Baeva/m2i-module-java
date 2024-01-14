package dec15.TP.tp6;

public class Main {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque("municipale");

        Auteur victorHugo = new Auteur("Victor Hugo");
        Auteur alexandreDumas = new Auteur("Alexandre Dumas");
        Auteur raymondQueneau = new Auteur("Raymond Queneau");

        Oeuvre o1 = new Oeuvre("Les miserables", victorHugo);
        Oeuvre o2 = new Oeuvre("L’Homme qui rit", victorHugo);
        Oeuvre o3 = new Oeuvre("Le Comte de Monte-Cristo", alexandreDumas);
        Oeuvre o4 = new Oeuvre(" Zazie dans le metro", raymondQueneau);
        Oeuvre o5 = new Oeuvre("Le Comte de Monte-Cristo", alexandreDumas, "anglais");


        bibliotheque.stocker(o1 ,2);
        bibliotheque.stocker(o2);
        bibliotheque.stocker(o3,3);
        bibliotheque.stocker(o4);
        bibliotheque.stocker(o5);


        var count1 = bibliotheque.compterExemplaires(o3);
        System.out.println(count1);


    }
}
