package Factory_Method.factories;

import Factory_Method.clase.MijlocTransport;

public interface Factory {
    public MijlocTransport createMijlocTransport(int linie, int nrLocuri, int anFabricatie, double extra);
}
