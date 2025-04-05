package C_Factory_Method.clase;

public class MedicamentDurere extends Medicament {

    public MedicamentDurere(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public String toString() {
        return super.toString() + ". Medicamentul este pentru durere.";
    }
}
