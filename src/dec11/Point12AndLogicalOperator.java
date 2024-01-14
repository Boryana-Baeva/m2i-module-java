package dec11;

import java.util.Scanner;

public class Point12AndLogicalOperator {
    public static void main(String[] args) {
        final int AGE_MAJORITE = 18;

        var input = new Scanner(System.in);
        System.out.println("Votre pays : ");
        var country = input.nextLine();

        System.out.println("Votre age : ");
        var age = input.nextInt();
        var isMajor = age >= AGE_MAJORITE;
        var isFrench = country.equals("France");

        if(isFrench && isMajor) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote");
        }
    }
}
