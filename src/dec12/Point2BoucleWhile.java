package dec12;

import java.util.Scanner;

public class Point2BoucleWhile {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Veuillez entrez un code PIN : ");
        var codePin = input.nextInt();

//        var codePinATester = 0;
//        while(codePinATester != codePin) {
//            System.out.print("Veuillez entrez un code PIN pour débloquer l'appareil: ");
//            codePinATester = input.nextInt();
//            if (codePinATester != codePin) {
//                System.out.println("Code Pin invalide, veuillez réessayer.");
//            }
//        }

        int codePinATester;
        do{
            System.out.print("Veuillez entrer un code PIN pour débloquer l'appareil: ");
            codePinATester=input.nextInt();
            if(codePinATester!=codePin){
                System.out.println("Code Pin invalide, veuillez réessayer.");
            }
        } while (codePinATester!=codePin);// 1234 != 1234 => false

    }

    }
}
