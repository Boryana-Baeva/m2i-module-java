import java.util.Scanner;

public class TP25 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        var number1 = input.nextDouble();
        System.out.print("Entrez le 2ème nombre : ");
        var number2 = input.nextDouble();

        System.out.println("Addition (choisir 1 ou +)");
        System.out.println("Soustraction (choisir 2 ou -)");
        System.out.println("Multiplication (choisir 3 ou x)");
        System.out.println("Division(Choisir 4 ou /)");
        System.out.println("Votre choix : ");
        var choix = input.next().charAt(0);


        switch (choix) {
            case '+','1' :
                System.out.printf("%.1f + %.1f = %.1f",number1, number2, (number1 + number2)); break;
            case '-','2' :
                System.out.printf("%.1f - %.1f = %.1f",number1, number2, (number1 - number2)); break;
            case 'x','3' :
                System.out.printf("%.1f * %.1f = %.1f",number1, number2, (number1 * number2)); break;
            case '/','4' :
                System.out.printf("%.1f / %.1f = %.1f",number1, number2, (number1 / number2)); break;
            default:
                System.out.println("Sélection invalide ! ");
        }

    }
}
