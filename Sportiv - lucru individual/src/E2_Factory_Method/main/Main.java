package E2_Factory_Method.main;


import E2_Factory_Method.clase.Jucator;
import E2_Factory_Method.factories.FactoryAtacant;
import E2_Factory_Method.factories.FactoryFundas;
import E2_Factory_Method.factories.FactoryJucator;
import E2_Factory_Method.factories.FactoryPortar;

public class Main {
    public static void main(String[] args) {
        FactoryJucator factoryFundas = new FactoryFundas();
        Jucator fundas = factoryFundas.creazaJucator("Alecu", 19, 2, 2, "FCSB", 2);
        System.out.println(fundas.toString());

        FactoryJucator factoryPortar = new FactoryPortar();
        Jucator portar = factoryPortar. creazaJucator("Ali", 26, 43, 9, "Dinamo", 12);
        System.out.println(portar.toString());

        FactoryJucator factoryAtacant = new FactoryAtacant();
        Jucator atacant = factoryAtacant.creazaJucator("Hagi", 21, 13, 4, "FCSB", 12);
        System.out.println(atacant.toString());
    }
}