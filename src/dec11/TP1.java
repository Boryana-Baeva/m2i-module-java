package dec11;

import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Saisissez la valeur du diamètre : ");
        var diametre = input.nextDouble();

        var rayon = diametre / 2;
        var surface = Math.pow(rayon, 2) * Math.PI;

        System.out.printf("La surface est : %.2f", surface);
    }
}
