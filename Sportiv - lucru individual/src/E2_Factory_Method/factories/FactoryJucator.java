package E2_Factory_Method.factories;

import E2_Factory_Method.clase.Jucator;

public interface FactoryJucator {
    public Jucator creazaJucator(String nume, int varsta, int numar, int vechime, String echipa, int extra);
}
