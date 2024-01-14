package dec15;

public class Main {
    public static void main(String[] args) {
        //Personnage p=new Personnage("Pepe",100);  //Erreur car la classe est abstraite
        Guerrier chris=new Guerrier("Chris",200,500);
        Magicien yonis=new Magicien("Yonis",400,20000);
        Sorcier eric=new Sorcier("Eric",700,25000,10);
        Voleur wahiba=new Voleur("Wahiba",400,30000);

        System.out.println(yonis.getNom());
        System.out.println(eric.getNiveauDeVie());
        System.out.println(wahiba.getAgilite());
    }
}
