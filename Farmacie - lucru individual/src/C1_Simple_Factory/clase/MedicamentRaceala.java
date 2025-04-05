package C1_Simple_Factory.clase;

public class MedicamentRaceala extends Medicament{
    private int varstaMinimaAdministrare;
    public MedicamentRaceala(String denumire, float pret, int cantitate, int varstaMinimaAdministrare) {
        super(denumire, pret, cantitate);
        this.varstaMinimaAdministrare = varstaMinimaAdministrare;
    }

    public void setVarstaMinimaAdministrare(int varstaMinimaAdministrare) {
        this.varstaMinimaAdministrare = varstaMinimaAdministrare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", tip medicament= raceala, ");
        sb.append("varstaMinimaAdministrare=").append(varstaMinimaAdministrare);
        return sb.toString();
    }
}
