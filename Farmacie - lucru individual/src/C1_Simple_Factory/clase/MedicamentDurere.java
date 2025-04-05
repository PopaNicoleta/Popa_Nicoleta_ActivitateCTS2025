package C1_Simple_Factory.clase;

public class MedicamentDurere extends Medicament{

    private int cantitateMaximaAdmisaPeZi;

    public MedicamentDurere(String denumire, float pret, int cantitate, int cantitateMaximaAdmisaPeZi) {
        super(denumire, pret, cantitate);
        this.cantitateMaximaAdmisaPeZi = cantitateMaximaAdmisaPeZi;
    }

    public void setCantitateMaximaAdmisaPeZi(int cantitateMaximaAdmisaPeZi) {
        this.cantitateMaximaAdmisaPeZi = cantitateMaximaAdmisaPeZi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", tip medicament= durere, ");
        sb.append("cantitateMaximaAdmisaPeZi=").append(cantitateMaximaAdmisaPeZi);
        return sb.toString();
    }
}
