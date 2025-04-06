package E1_Simple_Factory.factory;

import E1_Simple_Factory.clase.Atacant;
import E1_Simple_Factory.clase.Fundas;
import E1_Simple_Factory.clase.Jucator;
import E1_Simple_Factory.clase.Portar;

public class FactoryJucator {
    public Jucator creazaJucator(TipJucator tip, String nume, int varsta, int numar, int vechime, String echipa, int extra){
        return switch(tip){
            case Fundas -> new Fundas(nume, varsta, numar, vechime,  echipa, extra);
            case Atacant -> new Atacant(nume, varsta, numar, vechime,  echipa, extra);
            case Portar -> new Portar(nume, varsta, numar, vechime,  echipa, extra);
            default -> null;
        };
    }
}
