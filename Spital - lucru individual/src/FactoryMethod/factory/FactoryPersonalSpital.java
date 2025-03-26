package FactoryMethod.factory;

import FactoryMethod.clase.PersonalSpital;

public interface FactoryPersonalSpital {

    PersonalSpital createPersonal(TipPersonalSpital tip, String nume, int varsta, double salariu);
}
