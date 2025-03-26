package SimpleFactory.main;

import SimpleFactory.clase.Asistent;
import SimpleFactory.clase.Brancardier;
import SimpleFactory.clase.Medic;
import SimpleFactory.clase.PersonalSpital;
import SimpleFactory.factory.FactoryPersonal;
import SimpleFactory.factory.TipPersonal;


public class Main {
    public static void main(String[] args) {
        FactoryPersonal personalFactory = new FactoryPersonal("Ion", 5000, 40, 10);

        PersonalSpital asistent = personalFactory.getPersonal(TipPersonal.Asistent, "Chirurgie", 0, 300);
        asistent.prezintaPersonal();
        System.out.println("Salariu total: " + asistent.calculeazaSalariuTotalCuSpor(100));

        PersonalSpital medic = personalFactory.getPersonal(TipPersonal.Medic, "Cardiologie", 5, 500);
        medic.prezintaPersonal();
        System.out.println("Salariu total: " + medic.calculeazaSalariuTotalCuSpor(200));

        PersonalSpital brancardier = personalFactory.getPersonal(TipPersonal.Brancardier, "noapte", 8, 150);
        brancardier.prezintaPersonal();
        System.out.println("Salariu total: " + brancardier.calculeazaSalariuTotalCuSpor(50));
    }
}