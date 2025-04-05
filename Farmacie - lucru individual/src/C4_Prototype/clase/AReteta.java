package C4_Prototype.clase;

import java.util.HashMap;
import java.util.Map;

public abstract class AReteta {
    protected int nrReteta;
    protected  Map<String, Double> compozitieMedicament;

    public AReteta() {
        this.nrReteta = 0;
        this.compozitieMedicament = new HashMap<String, Double>();
        compozitieMedicament.put("acid salicilic", 10.0);
        compozitieMedicament.put("acid hialuronic", 21.8);
    }

    public AReteta(int nrReteta, Map<String, Double> compozitieMedicament) {
        this.nrReteta = nrReteta;
        this.compozitieMedicament = compozitieMedicament;
    }

    public int getNrReteta() {
        return nrReteta;
    }

    public void setNrReteta(int nrReteta) {
        this.nrReteta = nrReteta;
    }

    public Map<String, Double> getCompozitieMedicament() {
        return compozitieMedicament;
    }

    public void setCompozitieMedicament(Map<String, Double> compozitieMedicament) {
        this.compozitieMedicament = compozitieMedicament;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta cu numarul ")
                .append(nrReteta)
                .append(" are urmatoarea compozitie de medicamente: ")
                .append(compozitieMedicament);
        return sb.toString();
    }

    public abstract AReteta clone();
}
