package main;

import builderClase.Bicicleta;
import builderClase.BicicletaBuilder;
import factory.BicicletaFactory;
import factory.TipBicicleta;

public class Main {
    public static void main(String[] args) {

        BicicletaBuilder builder = new BicicletaBuilder();

        Bicicleta bicicleta1 = builder.setAreCascaDeProtectie(true).build("bicicleta_1", "negru", 400);
        System.out.println(bicicleta1);

        Bicicleta bicicleta2 = builder.build("bicicleta_2", "rosu", 1200);
        System.out.println(bicicleta2);

        Bicicleta bicicleta3 = builder.build("bicicleta_3", "gri", 1000);
        System.out.println(bicicleta3);

        Bicicleta bicicleta4 = builder.build("bicicleta_4", "galbena", 700);
        System.out.println(bicicleta4);

        BicicletaFactory factory = new BicicletaFactory();

        Bicicleta trekking = factory.createBicicleta(TipBicicleta.Trekking, "bicicleta_5", "negru", 400, true, false, false, false, 12);
        System.out.println(trekking);

        Bicicleta bicicleta6 = factory.createBicicleta(TipBicicleta.MTB, "bicicleta_6", "rosu", 1000, false, false, false, false, 2020);
        System.out.println(bicicleta6);

        Bicicleta bicicleta7 = factory.createBicicleta(TipBicicleta.Trekking, "bicicleta_7", "rosu", 1000, false, false, false, false, 2025);
        System.out.println(bicicleta7);

        Bicicleta bicicleta8 = factory.createBicicleta(TipBicicleta.Electrica, "bicicleta_8", "rosu", 1000, false, false, false, false, 13);
        System.out.println(bicicleta8);
    }
}
