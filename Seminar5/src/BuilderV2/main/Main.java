package BuilderV2.main;

import BuilderV2.clase.Pacient;
import BuilderV2.clase.PacientBuilder;
import FactoryMethod.clase.PersonalSpital;
import FactoryMethod.factories.FactoryPersonalMedical;
import FactoryMethod.factories.FactoryPersonalNonMedical;
import FactoryMethod.factories.TipPersonalMedical;
import FactoryMethod.factories.TipPersonalNonMedical;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder();
        pacientBuilder.setNumeInsotitor("Maricica").setAreMicDejunInclus(true).setArePapuciDeCamera(true);

        Pacient pacient = pacientBuilder.build("Costel");
        System.out.println(pacient.toString());

        Pacient pacient1 = pacientBuilder.setNumeInsotitor("Maria").build("Ion");
        System.out.println(pacient1.toString());

        Pacient pacient2 = pacientBuilder.setNumeInsotitor("Joana").build("Nicu");
        System.out.println(pacient2.toString());
    }
}