package Factory_Method.factories;

import Factory_Method.clase.Autobuz;
import Factory_Method.clase.MijlocTransport;

public class FactoryAutobuz implements Factory {
    @Override
    public MijlocTransport createMijlocTransport(int linie, int nrLocuri, int anFabricatie, double extra) {
        return new Autobuz(linie, nrLocuri, anFabricatie, extra);
    }
}
