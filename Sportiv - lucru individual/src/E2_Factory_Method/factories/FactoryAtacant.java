package E2_Factory_Method.factories;

import E2_Factory_Method.clase.Atacant;
import E2_Factory_Method.clase.Jucator;

public class FactoryAtacant implements  FactoryJucator {
    @Override
    public Jucator creazaJucator(String nume, int varsta, int numar, int vechime, String echipa, int nrGoluriDate) {
        return new Atacant(nume, varsta, numar, vechime, echipa, nrGoluriDate);

    }
}
