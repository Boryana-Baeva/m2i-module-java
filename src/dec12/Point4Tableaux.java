package dec12;

import java.util.Arrays;

public class Point4Tableaux {
    public static void main(String[] args) {
        double[] notesPhysique = {5, 12, 17, 8, 15};

        for (int i = 0; i < notesPhysique.length; i++) {
            //System.out.println(notesPhysique[i]);
        }

        double somme = 0;
        for (int i = 0; i < notesPhysique.length; i++) {
            somme += notesPhysique[i];
        }

        double moyenne = somme/ notesPhysique.length;

        System.out.printf("Somme : %.1f\nMoyenne %.3f\n",somme,moyenne);


        System.out.println(somme);
        System.out.println(Arrays.stream(notesPhysique).sum());



    }
}
