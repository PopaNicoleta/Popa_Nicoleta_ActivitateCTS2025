package Builder.main;

import Builder.clase.AbstractBuilder;
import Builder.clase.Pacient;
import Builder.clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {

        PacientBuilder pacientBuilder = new PacientBuilder("Maria");
        Pacient pacient = pacientBuilder.setNumePrieten("Maricica").setAreMicDejunInclus(true).buildPacient();
        System.out.println(pacient.toString());

        //pacient = pacientBuilder.setNumePrieten("Costel").buildPacient();

        Pacient pacient2 = pacientBuilder.setNumePrieten("Gigel").buildPacient();
        System.out.println(pacient2.toString());
    }
}