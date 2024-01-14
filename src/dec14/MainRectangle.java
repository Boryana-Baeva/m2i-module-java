package dec14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrez les dimensions d'un rectangle.");

        try {
            System.out.print("a = ");
            double a = input.nextDouble();
            System.out.print("b = ");
            double b = input.nextDouble();

            Rectangle rectangle = new Rectangle(a,b);

            System.out.printf("P = 2x(%.1f + %.1f) = %.1f\n",
                    rectangle.getA(), rectangle.getB(),
                    rectangle.calculatePerimeter());

            System.out.printf("S = %.1f x %.1f = %.1f",
                    rectangle.getA(), rectangle.getB(),
                    rectangle.calculateArea());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Le format de la saisie n'est pas valide! Veuillez saisir des valeurs numériques.");
        }

    }
}