package dec12;

import java.util.Scanner;

public class Point1Exo {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        var nombre = input.nextInt();

        for (int c = 1; c <= 13; c++) {
            var produit = nombre * c;
            System.out.printf("%d x %d = %d\n", nombre, c, produit);
        }

    }
}

