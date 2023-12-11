import java.util.Scanner;

public class Point10ConditionsBooleanType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Votre age : ");

        final int AGE_MAJORITE = 18;

        int age = input.nextInt();
        boolean isMajor = age >= AGE_MAJORITE;

        if(isMajor) {
            System.out.println("Continuer....");
        } else {
            System.out.println("Au revoir.");
        }
    }
}