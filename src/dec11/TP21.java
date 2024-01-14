package dec11;

import java.util.Scanner;

public class TP21 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Votre langue :");
        var language=input.next();// french
        var message = switch (language.toLowerCase()) {
            case "english" -> "Hello!!";
            case "french" -> "Salut!!";
            case "spanish" -> "Hola!!";
            case "german" -> "Guten tag!!";
            default -> "Language not supported.";
        };
        System.out.println(message);

        /*switch (language.toLowerCase()) {
            case "english" : message = "Hello!!";break;
            case "french" : message = "Salut!!";break;
            case "spanish" : message = "Hola!!";break;
            case "german" : message = "Guten tag!!";break;
            default: message = "Language not supported.";
        }
        System.out.println(message);*/

//        if(language.equals("english")){
//            System.out.println("Hello!!");
//        }else if(language.equals("french")){
//            System.out.println("Salut!!");
//        }else if(language.equals("spanish")){
//            System.out.println("Hola!!");
//        }else if(language.equals("german")){
//            System.out.println("Guten tag!!");
//        }else {
//            System.out.println("Language not supported.");
//        }
    }
}
