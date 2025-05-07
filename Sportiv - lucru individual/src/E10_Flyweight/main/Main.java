package E10_Flyweight.main;

import E10_Flyweight.clase.Caracteristici;
import E10_Flyweight.clase.Fabrica;

public class Main {
    public static void main(String[] args) throws Exception {
        Fabrica fabrica = new Fabrica();

        Caracteristici caracteristici = new Caracteristici(1.90, 0.9);
        Caracteristici caracteristici2 = new Caracteristici(1.68, 0.78);

        fabrica.getPersoane(3, "rosu").deseneaza(caracteristici);
        fabrica.getPersoane(8, "albastru").deseneaza(caracteristici2);
        fabrica.getPersoane(4, "negru").deseneaza(caracteristici);
    }
}
