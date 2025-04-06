package E1_Simple_Factory.main;

import E1_Simple_Factory.clase.Jucator;
import E1_Simple_Factory.factory.FactoryJucator;
import E1_Simple_Factory.factory.TipJucator;

public class Main {
    public static void main(String[] args) {

        FactoryJucator factory = new FactoryJucator();
        Jucator portar = factory.creazaJucator(TipJucator.Portar, "Alecu", 19, 2, 2, "FCSB", 6);
        System.out.println(portar.toString());

        Jucator atacant = factory.creazaJucator(TipJucator.Atacant, "Hagi", 21, 13, 4, "FCSB", 12);
        System.out.println(atacant.toString());

        Jucator fundas = factory.creazaJucator(TipJucator.Fundas, "Ali", 26, 43, 9, "Dinamo", 0);
        System.out.println(fundas.toString());
    }
}