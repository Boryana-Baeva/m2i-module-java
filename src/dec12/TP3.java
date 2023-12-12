package dec12;

import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        var nombre = input.nextInt();

        if(nombre < 0) {
            System.err.println("La factorielle n'est pas définie pour les nombres négatifs. Réessayez !");
            System.exit(1);
        }

        var factorielle = 1;
        var expressionString = new StringBuilder();

        for (int i = 1; i <= nombre ; i++) {
            factorielle *= i;

            var index = nombre-i+1;
            expressionString.append(index);

            if(index > 1) {
                expressionString.append("x");
            }

        }
        System.out.printf("La factorielle de %d : %s = %d", nombre, expressionString, factorielle);
    }
}
