import java.time.Year;
import java.util.Scanner;

public class TP4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Donnez votre age : ");
        int age = input.nextInt();

        int birthYear = Year.now().getValue() - age;

        System.out.printf("Votre année de naissance est : %d", birthYear);
    }
}
