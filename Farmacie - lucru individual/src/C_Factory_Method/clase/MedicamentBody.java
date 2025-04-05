package C_Factory_Method.clase;

public class MedicamentBody extends Medicament{

    public MedicamentBody(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public String toString() {
        return super.toString() + ". Medicamentul este pentru corp.";
    }
}
