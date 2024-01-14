package dec14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionException {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        try {
            System.out.print("Votre age : ");
            int age=input.nextInt();
            System.out.println(age);

            System.out.print("Votre poids : ");
            double poids=input.nextDouble();
            System.out.println(poids);
        }catch (InputMismatchException e){
            System.out.println(e);
            System.out.println("Saisie invalide");
        }
    }
}
