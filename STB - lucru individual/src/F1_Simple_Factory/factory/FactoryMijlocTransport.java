package F1_Simple_Factory.factory;

import F1_Simple_Factory.clase.Autobuz;
import F1_Simple_Factory.clase.MijlocTransport;
import F1_Simple_Factory.clase.Tramvai;
import F1_Simple_Factory.clase.Troleibuz;

public class FactoryMijlocTransport {
    public MijlocTransport createMijlocTransport(TipMijlocTransport tip, int linie, int nrLocuri, int anFabricatie, double extra) {
        return switch(tip){
            case Tramvai -> new Tramvai(linie, nrLocuri, anFabricatie, extra);
            case Troleibuz -> new Troleibuz(linie, nrLocuri, anFabricatie, extra);
            case Autobuz ->  new Autobuz(linie, nrLocuri, anFabricatie, extra);
            default -> null;
        };
    }
}
