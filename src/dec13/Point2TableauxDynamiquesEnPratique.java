package dec13;

import java.util.ArrayList;
import java.util.Scanner;

public class Point2TableauxDynamiquesEnPratique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //double[] notesPhysique = new double[3];
        ArrayList<Double> notesPhysique = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.printf("Note[%d] : ", i);
            notesPhysique.add(input.nextDouble());
        }

        /*for (int i = 0; i < notesPhysique.size(); i++) {
            System.out.printf("Note[%d] : %.1f\n", i, notesPhysique.get(i));
        }*/

        for (double note : notesPhysique) {
            System.out.println(note);
        }
    }
}
