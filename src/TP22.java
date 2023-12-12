import java.util.Scanner;

public class TP22 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Entrez un nombre entier: ");
        var number = input.nextInt();
        var isPositif = number > 0;
        var isZero = number ==0;
        var isPair = number % 2 == 0;

        if(isPositif) {
            System.out.print("Le nombre est positif ");
            if(isPair) {
                System.out.println("et pair");
            } else {
                System.out.println("et impair");
            }
        } else if (isZero) {
            System.out.println("Le nombre est zéro (et il est pair)");
        } else {
            System.out.print("Le nombre est négatif ");
            if(isPair) {
                System.out.println("et pair");
            } else {
                System.out.println("et impair");
            }
        }


    }
}
