package F1_Simple_Factory.main;

import F1_Simple_Factory.clase.MijlocTransport;
import F1_Simple_Factory.factory.FactoryMijlocTransport;
import  F1_Simple_Factory.factory.TipMijlocTransport;
public class Main {
    public static void main(String[] args) {

        FactoryMijlocTransport factory = new FactoryMijlocTransport();

        MijlocTransport autobuz = factory.createMijlocTransport(TipMijlocTransport.Autobuz, 100, 50, 2015, 3.5);
        System.out.println(autobuz.toString());

        MijlocTransport tramvai = factory.createMijlocTransport(TipMijlocTransport.Tramvai, 5, 70, 2010, 120.5);
        System.out.println(tramvai.toString());

        MijlocTransport troleibuz = factory.createMijlocTransport(TipMijlocTransport.Troleibuz, 7, 40, 2018, 75.0);
        System.out.println(troleibuz.toString());


    }
}