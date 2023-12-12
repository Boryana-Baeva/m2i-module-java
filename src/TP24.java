import java.util.Scanner;

public class TP24 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Saisissez un entier entre 1 et 12 : ");
        var number = input.nextInt();

        // Solution 1
//        var result = "";
//        switch (number) {
//            case 1 -> result = "Janvier";
//            case 2 -> result = "Février";
//            case 3 -> result = "Mars";
//            case 4 -> result = "Avril";
//            case 5 -> result = "Mai";
//            case 6 -> result = "Juin";
//            case 7 -> result = "Juillet";
//            case 8 -> result = "Août";
//            case 9 -> result = "Septembre";
//            case 10 -> result = "Octobre";
//            case 11 -> result = "Novembre";
//            case 12 -> result = "Décembre";
//            default -> result = "Invalid ! Le nombre doit être entre 1 et 12.";
//        }
//        System.out.printf("Mois : %d\n", number);
//        System.out.printf("Résultat : %s", result);


        // Solution 2
        String[] months = {"Janvier", "Février", "Mars", "Avril", "Mai",
                            "Juin", "Juillet", "Août", "Septembre",
                            "Octobre", "Novembre", "Décembre"};

        System.out.printf("Mois : %d\n", number);

        if(number >= 1 && number <= 12) {
            System.out.printf("Résult : %s", months[number-1]);
        } else {
            System.out.println("Invalid ! Le nombre doit être entre 1 et 12.");
        }

    }
}
