package dec12;

import java.util.Scanner;

public class TP4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Entrez n :");
        var n = input.nextInt();

        for (int i = 1; i <= n ; i++) {
            var isMultipleOf3 = i % 3 == 0;
            var isMultipleOf5 = i % 5 == 0;

            if(isMultipleOf3 && isMultipleOf5) {
                System.out.println("fizzbuzz");
            } else if(isMultipleOf3) {
                System.out.println("fizz");
            } else if (isMultipleOf5) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
