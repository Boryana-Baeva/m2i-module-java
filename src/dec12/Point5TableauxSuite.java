package dec12;

import java.util.Scanner;

public class Point5TableauxSuite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notesPhysique = new double[3];

        for (int i = 0; i < notesPhysique.length; i++) {
            System.out.printf("Note[%d] : ", i);
            notesPhysique[i] = input.nextDouble();
        }

        for (int i = 0; i < notesPhysique.length; i++) {
            System.out.printf("Note[%d] : %.1f\n", i, notesPhysique[i]);
        }
    }
}
