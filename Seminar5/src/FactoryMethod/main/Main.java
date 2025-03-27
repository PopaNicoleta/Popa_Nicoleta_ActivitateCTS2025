package FactoryMethod.main;

import FactoryMethod.clase.Medic;
import FactoryMethod.clase.PersonalSpital;
import FactoryMethod.factories.*;

public class Main {
    public static void main(String[] args) {
        FactoryPersonalMedical factoryPersonalMedical = new FactoryPersonalMedical(10.4);
        FactoryPersonalNonMedical factoryPersonalNonMedical = new FactoryPersonalNonMedical(15);

        PersonalSpital medic = factoryPersonalMedical.creazaPersonalSpital(TipPersonalMedical.Medic, "Marcel", 10000);
        factoryPersonalMedical.setSpor(100);
        System.out.println(medic.toString());

        PersonalSpital portar = factoryPersonalNonMedical.creazaPersonalSpital(TipPersonalNonMedical.Portar, "Costel", 4000);
        factoryPersonalNonMedical.setVechime(34);
        System.out.println(portar.toString());
    }
}