package dec14;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle (double a, double b) {
        this.setA(a);
        this.setB(b);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    private void setA(double a) {
        if(a <= 0) throw new IllegalArgumentException("Argument a invalide! Veuillez saisir des valeurs supérieures à 0.");
        this.a = a;
    }

    public void setB(double b) {
        if(b <= 0) throw new IllegalArgumentException("Argument b invalide! Veuillez saisir des valeurs supérieures à 0");
        this.b = b;
    }

    public double calculatePerimeter() {
        return 2*(this.a + this.b);
    }

    public double calculateArea() {
        return this.a*this.b;
    }
}
