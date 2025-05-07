package F9_Flyweight.main;
import F9_Flyweight.clase.Caracteristici;
import F9_Flyweight.clase.Fabrica;

public class Main {
    public static void main(String[]args) throws Exception {
        Fabrica fabrica = new Fabrica();

        Caracteristici caracteristici1 = new Caracteristici("Amurgului", "Piata Romana");
        Caracteristici caracteristici2 = new Caracteristici("ASE", "Petrache Poienaru");
        Caracteristici caracteristici3 = new Caracteristici("Fabrica de Paine", "Piata Unirii");

        fabrica.getAutobuze("un model", 2016, 30, 32).salveaza(caracteristici1);
        fabrica.getAutobuze("alt model", 2009, 27, 12).salveaza(caracteristici2);
        fabrica.getAutobuze("celalalt model", 2020, 45, 1).salveaza(caracteristici3);
    }
}
