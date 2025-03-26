package FactoryMethod.factory;

import FactoryMethod.clase.Registrator;
import FactoryMethod.clase.Secretar;
import FactoryMethod.clase.Brancardier;
import FactoryMethod.clase.PersonalSpital;
import FactoryMethod.factory.TipPersonalMedical;

public class FactoryPersonalSpitalNonMedical implements FactoryPersonalSpital {
    @Override
    public PersonalSpital createPersonal(TipPersonalSpital tip, String nume, int varsta, double salariu) {
        return switch((TipPersonalNonMedical)tip){
            case Brancardier -> new Brancardier(nume, varsta, salariu);
            case Secretar ->  new Secretar(nume, varsta, salariu);
            case Registrator ->  new Registrator(nume, varsta, salariu);
            default -> null;
        };
    }
}
