package dec12;

import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        var nombre=input.nextInt();
        System.out.println("Entrez start : ");
        var start=input.nextInt();
        System.out.println("Entrez end : ");
        var end=input.nextInt();

        if(start <= end) {
            for(int c=start;c<=end;c++){
                var produit=nombre*c;
                System.out.printf("%d x %d = %d\n",nombre,c,produit);
            }
        } else {
            System.out.println("Attention ! Start ne doit être supperieur à End.");
        }


    }
}
