package SimpleFactory.clase;

import Singleton.clase.AMasina;

public class SEDAN extends AMasina {

    public SEDAN(String marca, String model, String nrInmatriculare, int anFabricatie) {
        super(marca, model, nrInmatriculare, anFabricatie);
    }

    @Override
    public String toString() {
        return super.toString() + "Masina este de tipul Sedan.";
    }
}
