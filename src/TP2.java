import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Votre nom :");
        var nom = input.next();
        System.out.print("Votre prénom :");
        var prenom = input.next();
        System.out.print("Votre age :");
        var age = input.nextInt();

        System.out.printf("Vous vous appelez %s %s, et vous avez %d ans.", prenom, nom, age);


    }
}
