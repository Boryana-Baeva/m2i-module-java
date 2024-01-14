package dec14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTireLire {
    public static void main(String[] args) {
        Tirelire tirelire = new Tirelire();

        // Tests
        tirelire.afficher();
        tirelire.afficher();
        tirelire.remplir(550);
        //tirelire.remplir(50);
        tirelire.secouer();
        tirelire.afficher();
        tirelire.puiser(15);
        tirelire.afficher();
//        tirelire.vider();
//        tirelire.afficher();

        Scanner input = new Scanner(System.in);
        System.out.print("Donnez le budget de vos vacances : ");

        try {
            double budget = input.nextDouble();
            double solde = tirelire.calculerSolde(budget);

            if(solde <= 0) {
                System.out.printf("Vous êtes assez riche pour partir en vacances ! "
                        +" Il vous restera %.2f euros à la rentrée.\n",Math.abs(solde));
            } else {
                System.out.printf("Il vous manque %.2f euros pour partir en vacances !\n", Math.abs(solde));
            }
        } catch (InputMismatchException e) {
            System.out.println("Saisie invalide ! Veuillez saisir une valeur numérique.");
        }

    }
}
