package A14_Template.main;

import A14_Template.clase.Pacient;
import A14_Template.clase.Spital;
import A14_Template.clase.StarePacient;
import A14_Template.clase.Template;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Template spital = new Spital("Floreasca", 2);

        Pacient pacient1 = new Pacient("Mariana", StarePacient.Grava);
        Pacient pacient2 = new Pacient("Costel", StarePacient.Buna);
        Pacient pacient3 = new Pacient("Ionel", StarePacient.Grava);

        List<Pacient> pacienti = new ArrayList<Pacient>();
        pacienti.add(pacient1);
        pacienti.add(pacient2);
        pacienti.add(pacient3);

        ((Spital) spital).setPacienti(pacienti);

        spital.interneaza(pacient1);
        spital.interneaza(pacient2);
        spital.interneaza(pacient3);

    }
}
