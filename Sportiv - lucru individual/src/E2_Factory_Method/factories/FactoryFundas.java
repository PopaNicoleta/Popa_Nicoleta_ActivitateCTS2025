package E2_Factory_Method.factories;

import E2_Factory_Method.clase.Fundas;
import E2_Factory_Method.clase.Jucator;

public class FactoryFundas implements FactoryJucator {
    @Override
    public Jucator creazaJucator(String nume, int varsta, int numar, int vechime, String echipa, int nrCartonaseGalbene) {
        return new Fundas(nume, varsta, numar, vechime, echipa, nrCartonaseGalbene
        );

    }
}
