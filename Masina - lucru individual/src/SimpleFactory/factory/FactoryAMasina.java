package SimpleFactory.factory;

import SimpleFactory.clase.SEDAN;
import SimpleFactory.clase.SUV;
import SimpleFactory.clase.VAN;
import Singleton.clase.AMasina;

public class FactoryAMasina {
    public AMasina creazaMasina(TipMasina tip, String marca, String model, String numarInmatriculare, int anFabricatie){
        return switch(tip){
          case SUV -> new SUV(marca, model, numarInmatriculare, anFabricatie);
          case VAN -> new VAN(marca, model, numarInmatriculare, anFabricatie);
          case Sedan -> new SEDAN(marca, model, numarInmatriculare, anFabricatie);
          default -> null;
        };
    }
}
