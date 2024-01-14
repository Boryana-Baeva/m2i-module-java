package dec14;

public class MethodesEtExceptions {
    public static int calculDeLaSomme(int a, int b) throws IllegalArgumentException {
        if(a<=0 || b<=0)
            throw new IllegalArgumentException("Les 2 entrées doivent être positives.");
        return a+b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(calculDeLaSomme(-2,4));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
