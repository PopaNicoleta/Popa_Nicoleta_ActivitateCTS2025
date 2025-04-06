package Factory_Method.factories;

import Factory_Method.clase.MijlocTransport;
import Factory_Method.clase.Troleibuz;

public class FactoryTroleibuz implements Factory {
    @Override
    public MijlocTransport createMijlocTransport(int linie, int nrLocuri, int anFabricatie, double extra) {
        return new Troleibuz(linie, nrLocuri, anFabricatie, extra);
    }
}
