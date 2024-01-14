package dec13;

import java.util.Scanner;

public class TP1 {
    static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius,2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Saisissez la valeur du rayon : ");
        double radius = 0;

        while (true) {
            if(input.hasNextDouble()) {
                radius = input.nextDouble();

                if(radius >= 0) {
                    double area = calculateCircleArea(radius);
                    System.out.printf("L'aire du cercle avec rayon %.2f est %.2f.",radius, area);
                    break;
                }
                System.out.print("La valeur du rayon doit être positive. ");
            } else {
                input.next();
            }
            System.out.print("Saisie invalide! Réessayez :");
        }

        input.close();
    }
}
