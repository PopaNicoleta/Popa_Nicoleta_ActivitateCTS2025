package C4_Prototype.clase;

import java.util.Map;

public class Reteta extends AReteta{

    public Reteta() {

    }

    public Reteta(int nrReteta, Map<String, Double> compozitieMedicament) {
        super(nrReteta, compozitieMedicament);
    }

    @Override
    public AReteta clone() {
        Reteta reteta = new Reteta();
        reteta.nrReteta = this.nrReteta;
        reteta.compozitieMedicament = this.compozitieMedicament;
        return reteta;
    }
}
