package dec12;

import java.util.Scanner;

public class TP522 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int noteNumber = 1;
        double somme = 0;
        double moyenne = 0;
        StringBuilder notes = new StringBuilder();

        System.out.println("Veuillez saisir vos notes. Pour terminer, veuillez saisir \"Stop\".");
        System.out.printf("Note[%d] : ", noteNumber);
        String saisie = input.next();

        while (!saisie.equalsIgnoreCase("stop")) {
            // Check if the grade is valid
            // If not : ask to reenter the grade and continue to next iteration
            if(Double.parseDouble(saisie) < 0 || Double.parseDouble(saisie) > 20) {
                System.out.println("La valeur d'une note doit être entre 0 et 20! Veuillez réessayer ! ");
                System.out.printf("Note[%d] : ", noteNumber);
                saisie = input.next();
                continue;
            }

            // Add the grade to the collection
            notes.append(saisie).append(" ");

            // Prepare next iteration
            noteNumber++;
            System.out.printf("Note[%d] : ", noteNumber);
            saisie = input.next();
        }

        // Create an array of grades
        String[] notesArr = notes.toString().split(" ");

        // Show the list of grades
        System.out.print("\n Vos notes: \n");
        for(int i=0;i<notesArr.length;i++){
            System.out.printf("Note[%d] : %s\n",i+1,notesArr[i]);
            //Calculate the total sum of the grades
            somme += Double.parseDouble(notesArr[i]);
        }
        // Calculate the average of the grades
        moyenne = somme/notesArr.length;

        System.out.println();
        System.out.printf("Somme : %.2f\n",somme);
        System.out.printf("Moyenne : %.2f\n",moyenne);

        input.close();
    }
}
