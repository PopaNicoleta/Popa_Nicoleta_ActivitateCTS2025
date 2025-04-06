package E2_Factory_Method.factories;
import E2_Factory_Method.clase.Jucator;
import E2_Factory_Method.clase.Portar;

public class FactoryPortar implements FactoryJucator {
    @Override
    public Jucator creazaJucator(String nume, int varsta, int numar, int vechime, String echipa, int nrGoluriAparate) {
        return new Portar(nume, varsta, numar, vechime, echipa, nrGoluriAparate);
    }
}
