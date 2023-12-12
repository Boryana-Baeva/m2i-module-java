package dec12;

public class TP2Tables {
    public static void main(String[] args) {
        System.out.println("Tables de multiplication");

        for (int i = 2; i <= 10 ; i++) {
            System.out.printf("Table de %d : \n", i);
            for (int j = 1; j <= 10 ; j++) {
                System.out.printf("%d * %d = %d\n", j, i, j*i);
            }
            System.out.println();
        }
    }
}
