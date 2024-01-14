package dec13;

import java.util.ArrayList;
import java.util.Scanner;

public class Point3ArrayListEnAction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> notesPhysique = new ArrayList<>();


        while (true) {
            System.out.print("Entrez un nombre : ");
            if (input.hasNextDouble()) {
                notesPhysique.add(input.nextDouble());
            } else {
                String value = input.next();
                if(value.equalsIgnoreCase("stop")) break;
                System.out.println("Entrée invalide. Veuillez saisir un nombre entier.");
                input.next(); // Ignorer l'entrée non valide
            }
        }


        double somme = 0;
        int nombreAconsiderer = 0;
        for (int i = 0; i < notesPhysique.size(); i++) {
            if (notesPhysique.get(i) >= 0 && notesPhysique.get(i) <= 20) {
                somme += notesPhysique.get(i);
                nombreAconsiderer++;
            } else {
                System.out.println("La valeur doit être >= 0 et <= 20.");
            }
        }

//        for (int i = 0; i < notesPhysique.size(); i++) {
//            System.out.printf("Note[%d] : %.2f\n", i, notesPhysique.get(i));
//        }

        System.out.println(notesPhysique);

        double moyenne = somme / nombreAconsiderer;
        System.out.printf("Somme : %.2f\n", somme);
        System.out.printf("Moyenne : %.2f\n", moyenne);

        input.close();
    }

}
