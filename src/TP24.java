import java.util.Scanner;

public class TP24 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Saisissez un entier entre 1 et 12 : ");
        var number = input.nextInt();

        // Solution 1
        var result = "";
        switch (number) {
            case 1 : result = "Janvier"; break;
            case 2 : result = "Février"; break;
            case 3 : result = "Mars"; break;
            case 4 : result = "Avril"; break;
            case 5 : result = "Mai"; break;
            case 6 : result = "Juin"; break;
            case 7 : result = "Juillet"; break;
            case 8 : result = "Août"; break;
            case 9 : result = "Septembre"; break;
            case 10 : result = "Octobre"; break;
            case 11 : result = "Novembre"; break;
            case 12 : result = "Décembre"; break;
            default: result = "Invalid ! Le nombre doit être entre 1 et 12.";
        }
        System.out.printf("Mois : %d\n", number);
        System.out.printf("Résultat : %s", result);


        // Solution 2
//        String[] months = {"Janvier", "Février", "Mars", "Avril", "Mai",
//                            "Juin", "Juillet", "Août", "Septembre",
//                            "Octobre", "Novembre", "Décembre"};
//        System.out.printf("Mois : %d\n", number);
//        System.out.printf("Résult : %s", months[number-1]);
    }
}
