package FactoryMethod.factories;

import FactoryMethod.clase.PersonalSpital;

public interface FactoryPersonal {
    PersonalSpital creazaPersonalSpital(TipPersonalSpital tip, String nume, double salariu);
}
