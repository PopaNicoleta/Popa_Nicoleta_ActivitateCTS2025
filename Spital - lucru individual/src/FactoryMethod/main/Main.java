package FactoryMethod.main;

import FactoryMethod.clase.PersonalSpital;
import FactoryMethod.factory.*;

public class Main {
    public static void main(String[] args) {

        FactoryPersonalSpital factoryPersonalSpitalMedical = new FactoryPersonalSpitalMedical();
        FactoryPersonalSpital factoryPersonalSpitalNonMedical = new FactoryPersonalSpitalNonMedical();

        PersonalSpital medic = factoryPersonalSpitalMedical.createPersonal(TipPersonalMedical.Medic, "Marian", 45, 10000);
        medic.afiseazaDetalii();

        PersonalSpital asistent = factoryPersonalSpitalMedical.createPersonal(TipPersonalMedical.Asistent, "Andreea", 32, 6000);
        asistent.afiseazaDetalii();

        PersonalSpital brancardier = factoryPersonalSpitalNonMedical.createPersonal(TipPersonalNonMedical.Brancardier, "Ion", 25, 3000);
        brancardier.afiseazaDetalii();

        PersonalSpital registrator = factoryPersonalSpitalNonMedical.createPersonal(TipPersonalNonMedical.Registrator, "Maria", 30, 4000);
        registrator.afiseazaDetalii();

        PersonalSpital secretar = factoryPersonalSpitalNonMedical.createPersonal(TipPersonalNonMedical.Secretar, "Dana", 28, 3500);
        secretar.afiseazaDetalii();
    }
}
