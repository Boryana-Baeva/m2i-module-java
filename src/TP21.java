import java.util.Scanner;

public class TP21 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Votre langue :");
        var language=input.next();// french
        var greeting = "";

        switch (language.toLowerCase()) {
            case "english" : greeting = "Hello!!";break;
            case "french" : greeting = "Salut!!";break;
            case "spanish" : greeting = "Hola!!";break;
            case "german" : greeting = "Guten tag!!";break;
            default: greeting = "Language not supported.";
        }
        System.out.println(greeting);

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
