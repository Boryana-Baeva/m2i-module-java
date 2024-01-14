package dec13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TP3 {
    static int calculateSumMultipliersOf3(ArrayList<Integer> multipliers) {
        int sum = 0;
        for(int number : multipliers) {
            sum += number;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez declarer 3 tableaux. Pour chaque tableau, veuillez séparer les valeurs par un espace.");
        ArrayList<ArrayList<Integer>> collection = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Tableau #%d : ", i);
            String[] userInputArray = input.nextLine().trim().split(" ");
            ArrayList<Integer> validElements = new ArrayList<>();

            for(String element : userInputArray) {
                // Check if all input elements are numbers
                try {
                    int numericElement = Integer.parseInt(element);
                    validElements.add(numericElement);
                } catch (Exception e) {
                    System.out.println("Format de la saisie invalide !");
                    System.exit(0);
                }
            }
            collection.add(validElements);
        }

        System.out.println();

        ArrayList<Integer> multipliersOf3 = new ArrayList<>();
        for (int i = 0; i < collection.size(); i++) {
            ArrayList<Integer> numbers = collection.get(i);
            // Show each array
            System.out.printf("T%d : %s\n", i+1, numbers.toString());

            // Extract only the multipliers of 3 from each array
            for(int number : numbers) {
                if(number % 3 == 0 && number != 0) {
                    multipliersOf3.add(number);
                }
            }
        }

        System.out.println();
        String expressionString = multipliersOf3.toString()
                                    .replaceAll("[\\[\\] ]", " ")
                                    .replaceAll(",", " +");
        // Calculate the sum of the multipliers
        int sumMultipliersOf3 = calculateSumMultipliersOf3(multipliersOf3);
        System.out.printf("S = %s = %d",expressionString,sumMultipliersOf3);

        input.close();
    }
}
