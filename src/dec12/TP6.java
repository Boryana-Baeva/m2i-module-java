package dec12;

import java.util.Scanner;

public class TP6 {
    public static void main(String[] args) {
        final int MAX_TENTATIVES = 5;
        var input=new Scanner(System.in);
        var countTentatives = 0;
        var codePinATester=0;
        var codePin = 0;
        var codeString = "";

        // Check if the chosen PIN code contains 4 digits
        do {
            System.out.print("Veuillez entrer un code PIN composé de 4 chiffres: ");

            codePin=input.nextInt();//1234  ->  Implement verif pour 0000
            codeString = Integer.toString(codePin);
            if(codeString.length() != 4)
                System.out.println("Code Pin Invalide!");
        } while (codeString.length() != 4);

        do{
            // Show number of attempts left after the 2nd unsuccessful attempt
            if(countTentatives >= 2 && countTentatives < MAX_TENTATIVES){
                System.out.printf("Attention ! Il vous reste %d tentatives.\n", MAX_TENTATIVES - countTentatives);
            }

            countTentatives++;
            // Restrict the number of unsuccessful attempts to 5
            if (countTentatives > MAX_TENTATIVES) {
                System.out.println("Attention ! Vous avez depassé le nombre de tentatives autorisées. L'appareil a été bloqué.");
                break;
            }

            System.out.print("Veuillez entrer un code PIN pour débloquer l'appareil: ");
            codePinATester=input.nextInt();

            // Check if the number of digits is correct, if not show the appropriate message and continue to next attempt
            codeString = Integer.toString(codePinATester);
            if(codeString.length() != 4) {
                System.out.println("Code Pin doit toujours être composé de 4 chiffres!");
                continue;
            }
            // Check if the provided PIN code matches the one initially set
            if(codePinATester!=codePin){
                System.out.println("Code Pin invalide, veuillez réessayer.");
            }
        } while (codePinATester!=codePin);// 1234 != 1234 => false

        // If the last attempt has been successful, show a welcome message
        if(codePinATester == codePin)
            System.out.println("Bienvenue !");

        input.close();
    }
}
