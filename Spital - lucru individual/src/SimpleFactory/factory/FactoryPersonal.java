package SimpleFactory.factory;

import SimpleFactory.clase.Asistent;

import SimpleFactory.clase.Brancardier;
import SimpleFactory.clase.Medic;
import SimpleFactory.clase.PersonalSpital;

public class FactoryPersonal {
    private String nume;
    private int salariu;
    private int varsta;
    private int vechime;

    public FactoryPersonal(String nume, int salariu, int varsta, int vechime) {
        this.nume = nume;
        this.salariu = salariu;
        this.varsta = varsta;
        this.vechime = vechime;
    }

    public PersonalSpital getPersonal(TipPersonal tip, String stringExtra, int intExtra, double doubleExtra) {
        return switch (tip) {
            case Asistent -> new Asistent(nume, salariu, varsta, vechime, stringExtra, doubleExtra);
            case Medic -> new Medic(nume, salariu, varsta, vechime, stringExtra, intExtra, doubleExtra);
            case Brancardier -> new Brancardier(nume, salariu, varsta, vechime, stringExtra, intExtra, doubleExtra);
            default -> null;

        };
    }
}
