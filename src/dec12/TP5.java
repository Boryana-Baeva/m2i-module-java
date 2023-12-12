package dec12;

import java.util.Scanner;

public class TP5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Veuillez indiquer le nombre de notes que vous souhaitez remplir : ");
        int countNotes = input.nextInt();

        while (countNotes < 0) {
            System.out.println("Veuillez indiquer un nombre positif : ");
            countNotes = input.nextInt();
        }

        double[] notesPhysique= new double[countNotes];

        for(int i=0;i<notesPhysique.length;i++){
            System.out.printf("Note[%d] : ",i);
            double noteSaisie = input.nextDouble();

            while(noteSaisie < 0 || noteSaisie > 20) {
                System.out.println("La valeur d'une note doit être entre 0 et 20! Veuillez réessayer : ");
                noteSaisie = input.nextDouble();
            }

            notesPhysique[i]=noteSaisie;
        }

        for(int i=0;i<notesPhysique.length;i++){
            System.out.printf("Note[%d] : %.1f\n",i,notesPhysique[i]);
        }

    }
}
