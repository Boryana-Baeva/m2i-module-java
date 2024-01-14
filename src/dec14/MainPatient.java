package dec14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPatient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double poids, taille;
        System.out.println("Calculer votre IMC:");

        try {
            System.out.print("Votre poids [kg] : ");
            poids = input.nextDouble();
            System.out.print("Votre taille [cm] : ");
            taille = input.nextDouble();

            Patient patient = new Patient(poids, taille);
            System.out.println();
            System.out.println(patient);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Le format de la saisie est invalide ! Veuillez saisir des valeurs numériques.");
        } catch (Exception e) {
            System.out.printf("Erreur : %s",e.getMessage());
        }

    }

}
