package C_Factory_Method.clase;

public class MedicamentRaceala extends Medicament{

    public MedicamentRaceala(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public String toString() {
        return super.toString() + ". Medicamentul este pentru raceala.";
    }
}
