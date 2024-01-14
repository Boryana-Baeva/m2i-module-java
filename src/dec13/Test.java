package dec13;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nombre : ");

        int nombre;
        if(input.hasNextInt()) {
            System.out.println("Ouiiii, c'est un entier.");
            nombre = Integer.parseInt(input.next());
        } else {
            System.out.println("Non, ce n'est pas un entier.");
        }
        //System.out.println(nombre);
    }
}
