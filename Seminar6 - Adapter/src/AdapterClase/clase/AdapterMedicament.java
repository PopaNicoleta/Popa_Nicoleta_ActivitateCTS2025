package AdapterClase.clase;


public class AdapterMedicament extends MedicamentSpital implements IMedicamentFarmacie {
    public AdapterMedicament(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
