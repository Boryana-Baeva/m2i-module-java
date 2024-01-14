package dec13;

import java.util.Scanner;

public class TP2 {
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Show options menu
        System.out.println("Choisissez un mode de conversion :");
        System.out.println("[1] Celsius -> Fahrenheit");
        System.out.println("[2] Fahrenheit -> Celsius");
        String mode = input.next();

        // Check if the chosen cerversion type is valid
        if(!mode.equals("1") && !mode.equals("2")) {
            System.out.println("Le mode choisi n'est pas valide!");
            System.exit(0);
        }
        // Read the conversion parameter
        System.out.println("Saisissez la valeur à convertir :");
        double value = 0;

        // Check if the chosen conversion parameter is valid
        if(input.hasNextDouble()) {
            value = input.nextDouble();
        } else {
            System.out.println("Saisie invalide !");
            System.exit(0);
        }
        // Call the appropriate conversion method according to the chosen conversion type
        switch (mode) {
            case "1" -> {
                System.out.printf("%.1f °C = %.1f °F",value,celsiusToFahrenheit(value));
            }
            case "2" -> {
                System.out.printf("%.1f °F = %.1f °C",value,fahrenheitToCelsius(value));
            }
            default -> {
                System.out.println("Le mode choisi n'est pas valide!");
            }
        }

        input.close();
    }
}
