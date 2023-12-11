import java.util.Scanner;

public class TP23 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Saisissez a :");
        var a = input.nextDouble();
        System.out.print("Saisissez b :");
        var b = input.nextDouble();
        System.out.print("Saisissez c :");
        var c = input.nextDouble();

        var discriminant = Math.pow(b,2) - 4*a*c;

        System.out.printf("a=%.2f, b=%.2f, c=%.2f\n", a, b, c);

        if (discriminant > 0) {
            System.out.printf("L'équation a deux solutions distinctes : ", a, b, c);
            System.out.printf("%.2f et %.2f",
                    (-b - Math.sqrt(discriminant))/(2*a),
                    (-b + Math.sqrt(discriminant))/(2*a));
        } else if (discriminant == 0) {
            System.out.printf("L'équation a une unique solution : %.2f", a, b, c, -(b/(2*a)));
        } else {
            System.out.printf("L'équation n'a pas de solution réelle", a, b, c);
        }
    }
}
