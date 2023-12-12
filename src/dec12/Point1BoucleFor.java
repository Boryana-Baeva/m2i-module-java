package dec12;

public class Point1BoucleFor {
    public static void main(String[] args) {
        for (var nombre = 2; nombre <= 10; nombre++) {
            var carre = Math.pow(nombre,2);
            System.out.printf("Le carré %d est %.0f.\n", nombre, carre);
        }
    }
}
