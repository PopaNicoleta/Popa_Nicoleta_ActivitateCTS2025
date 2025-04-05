package C1_Simple_Factory.clase;

public class MedicamentBody extends  Medicament{
    private int anExpirare;

    public MedicamentBody(String denumire, float pret, int cantitate, int anExpirare) {
        super(denumire, pret, cantitate);
        this.anExpirare = anExpirare;
    }

    public void setAnExpirare(int anExpirare) {
        this.anExpirare = anExpirare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", tip medicament= body, ");
        sb.append("anExpirare=").append(anExpirare);
        return sb.toString();
    }
}
