package dec13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TP4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Saisissez une liste de langages de programmation : ");
        String[] userInputArray = input.nextLine().trim().split(" ");

        // Filling the list
        ArrayList<String> programmingLanguagesList = new ArrayList<>();
        programmingLanguagesList.addAll(Arrays.asList(userInputArray));

        // Save a copy of the original list
        ArrayList<String> originalProgrammingLanguagesList = new ArrayList<>();
        originalProgrammingLanguagesList.addAll(programmingLanguagesList);

        // Remove chosen elements from the list
        System.out.println("Quels langages souhaitez-vous retirer de la liste ? ");
        String[] programmingLanguagesToRemove = input.nextLine().trim().split(" ");

        for (String element : programmingLanguagesToRemove) {
            if(!programmingLanguagesList.stream().anyMatch(element::equalsIgnoreCase)) {
                System.out.printf("%s n'est pas dans la liste !\n", element);
                continue;
            }
            programmingLanguagesList.removeIf(e -> e.equalsIgnoreCase(element));
        }

        // Show list before removal of chosen elements
        System.out.println(originalProgrammingLanguagesList);
        // Show list after removal of chosen elements
        System.out.println(programmingLanguagesList);

        input.close();
    }
}
