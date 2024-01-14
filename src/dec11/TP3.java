package dec11;

import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var x = 0;


        System.out.print("Entrez la première valeur(a) : ");
        var a = input.nextInt();
        System.out.print("Entrez la deuxième valeur(b) : ");
        var b = input.nextInt();
        System.out.print("Entrez la troisième valeur(c) : ");
        var c = input.nextInt();

        System.out.printf("Les valeurs entrées sont : a = %d, b = %d et c = %d\n", a, b, c);

        x = b;
        b = a;
        a = c;
        c = x;

        System.out.println("Permutation: b <== a, c <== b, a <== c");
        System.out.printf("Les valeurs permutées sont : a = %d, b = %d et c = %d\n", a, b, c);


    }
}
