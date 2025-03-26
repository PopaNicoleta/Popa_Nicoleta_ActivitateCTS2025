package FactoryMethod.factory;

import FactoryMethod.clase.Asistent;
import FactoryMethod.clase.Medic;
import FactoryMethod.clase.PersonalSpital;

public class FactoryPersonalSpitalMedical implements FactoryPersonalSpital{
    @Override
    public PersonalSpital createPersonal(TipPersonalSpital tip, String nume, int varsta, double salariu) {
        return switch((TipPersonalMedical)tip){
            case Medic -> new Medic(nume, varsta, salariu);
            case Asistent -> new Asistent(nume, varsta, salariu);
            default -> null;
        };
    }
}
