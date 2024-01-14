package dec15;

import java.util.ArrayList;

public class Marchand extends Personnage {
    private ArrayList<String> objects;

    public Marchand(String nom, int niveauDeVie) {
        super(nom, niveauDeVie);
        objects = new ArrayList<>();
    }

    public ArrayList<String> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<String> objects) {
        this.objects = objects;
    }

    @Override
    public void attaquer() {
        System.out.println("Je suis un marchand.");
    }

    @Override
    public void seDefendre() {
        System.out.println("Ahhh...");
    }
}
