package dec14;

public class Patient {
    private double poids;
    private double taille;
    private double imc;
    private String imcType;

    public Patient(double poids, double taille) {
        this.setPoids(poids);
        this.setTaille(taille);
        this.setImc(calculateIMC());
    }

    public double getPoids() {
        return poids;
    }

    public double getTaille() {
        return taille;
    }

    public double getImc() {
        return imc;
    }

    public String getImcType() {
        return imcType;
    }

    private void setPoids(double poids) {
        if(poids<=0) throw new IllegalArgumentException("Le poids doit être superieur à 0.");
        this.poids = poids;
    }

    private void setTaille(double taille) {
        if(taille<=0) throw new IllegalArgumentException("La taille doit être superieur à 0.");
        this.taille = taille;
    }

    private void setImc(double imc) {
        this.imc = imc;
    }

    private void setImcType(String imcType) {
        this.imcType = imcType;
    }

    private double calculateIMC() {
        double imc = this.poids / Math.pow(this.taille/100, 2);
        definirImcType(imc);
        return imc;
    }

    private void definirImcType(double imc) {
        String imcType = "";
        if(imc < 18.4) {
            imcType ="Maigre";
        } else if (imc >= 18.5 && imc <= 24.9) {
            imcType ="Normal";
        }
        else if (imc >= 25 && imc <= 29.9) {
            imcType ="En surpoids";
        }
        else if (imc >= 30 && imc <= 34.9) {
            imcType ="En obésité modérée";
        }
        else if (imc >= 35 && imc <= 39.9) {
            imcType ="En obésité sévère";
        }
        else if (imc >= 40) {
            imcType ="En obésité morbide";
        }
        this.setImcType(imcType);
    }

    @Override
    public String toString() {
        return String.format("Info Patient : \n" +
                "Poids : %.2fkg \n" +
                 "Taille : %.2fcm\n" +
                  "IMC : %.2f %s\n", this.poids, this.taille, this.imc, this.imcType);
    }
}
