package Factory_Method.main;

import Factory_Method.clase.MijlocTransport;
import Factory_Method.factories.Factory;
import Factory_Method.factories.FactoryAutobuz;
import Factory_Method.factories.FactoryTramvai;
import Factory_Method.factories.FactoryTroleibuz;

public class Main {
    public static void main(String[] args) {

        Factory factoryAutobuz = new FactoryAutobuz();
        MijlocTransport autobuz = factoryAutobuz.createMijlocTransport(100, 50, 2015, 3.5);
        System.out.println(autobuz.toString());

        Factory factoryTramvai = new FactoryTramvai();
        MijlocTransport tramvai = factoryTramvai.createMijlocTransport(5, 70, 2010, 90.5);
        System.out.println(tramvai.toString());

        Factory factoryTroleibuz = new FactoryTroleibuz();
        MijlocTransport troleibuz = factoryTroleibuz.createMijlocTransport(7, 40, 2018, 75.0);
        System.out.println(troleibuz.toString());
    }
}