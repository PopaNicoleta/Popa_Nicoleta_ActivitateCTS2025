package SimpleFactory.factory;

import SimpleFactory.clase.AbstractAirQualityReport;
import SimpleFactory.clase.RaportAerCurat;
import SimpleFactory.clase.RaportDeAvertizare;
import SimpleFactory.clase.RaportDeRisc;

public class FactoryRaport {
    public AbstractAirQualityReport createAirQualityReport(int  valoareNivelParticuleFine) {
        if(valoareNivelParticuleFine >= 0 && valoareNivelParticuleFine <= 30) {
            return new RaportAerCurat(valoareNivelParticuleFine);
        }
        else if(valoareNivelParticuleFine >= 31 && valoareNivelParticuleFine <= 70) {
            return new RaportDeAvertizare(valoareNivelParticuleFine);
        }
        else if(valoareNivelParticuleFine > 71){
            return new RaportDeRisc(valoareNivelParticuleFine);
        }
        return null;
    }
}
