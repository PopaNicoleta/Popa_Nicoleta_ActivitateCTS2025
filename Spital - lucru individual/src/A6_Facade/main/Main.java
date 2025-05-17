package A6_Facade.main;

import A6_Facade.clase.FacadeInternare;
import A6_Facade.clase.Medic;
import A6_Facade.clase.Pacient;
import A6_Facade.clase.Salon;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic("Anton Marian");

        List<Integer> paturiLibere = new ArrayList<Integer>();
        paturiLibere.add(1);
        paturiLibere.add(3);
        paturiLibere.add(5);

        List<Integer> paturiOcupate = new ArrayList<Integer>();
        paturiOcupate.add(2);
        paturiOcupate.add(4);
        paturiOcupate.add(6);

        Salon salon = new Salon(paturiLibere,paturiOcupate);

        Pacient pacinent = new Pacient("Pop Denisa", 31, "Grava");

        FacadeInternare facadeInternare = new FacadeInternare(medic, salon);
        facadeInternare.interneazaPacient(pacinent, 1);
    }
}
