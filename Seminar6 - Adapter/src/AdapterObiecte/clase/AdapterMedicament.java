package AdapterObiecte.clase;

public class AdapterMedicament extends MedicamentFarmacie{
    private MedicamentSpital medicamentSpital;

    public AdapterMedicament(String nume, float pret, boolean esteInStoc) {
        super(nume, pret, esteInStoc);
    }

    public AdapterMedicament(MedicamentSpital medicamentSpital){
      super(medicamentSpital.getNume(), medicamentSpital.getPret(), true);
      this.medicamentSpital = medicamentSpital;
    }

    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }

}
