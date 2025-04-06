package Factory_Method.factories;

import Factory_Method.clase.MijlocTransport;
import Factory_Method.clase.Tramvai;

public class FactoryTramvai implements Factory {
    @Override
    public MijlocTransport createMijlocTransport(int linie, int nrLocuri, int anFabricatie, double extra) {
        return new Tramvai(linie, nrLocuri, anFabricatie, extra);
    }
}
