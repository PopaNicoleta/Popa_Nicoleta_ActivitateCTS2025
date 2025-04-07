package SimpleFactory.clase;

import Singleton.clase.AMasina;

public class SUV extends AMasina {

    public SUV(String marca, String model, String nrInmatriculare, int anFabricatie) {
        super(marca, model, nrInmatriculare, anFabricatie);
    }

    @Override
    public String toString() {
        return super.toString() + "Masina este de tipul SUV.";
    }
}

