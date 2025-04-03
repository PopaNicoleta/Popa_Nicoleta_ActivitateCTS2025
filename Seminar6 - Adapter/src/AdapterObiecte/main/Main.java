package AdapterObiecte.main;

import AdapterObiecte.clase.AdapterMedicament;
import AdapterObiecte.clase.MedicamentFarmacie;
import AdapterObiecte.clase.MedicamentSpital;

public class Main {

    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        System.out.println("Farmacia noastra va vinde medicamentul ");
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Paracetamol", 5, true);
        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie("Nurofen", 20, true);

        vindeMedicament(medicamentFarmacie);
        vindeMedicament(medicamentFarmacie1);

        MedicamentSpital medicamentSpital = new MedicamentSpital("Antibiotic", 120);
        MedicamentSpital medicamentSpital1 = new MedicamentSpital("Antibiotic", 100);

        vindeMedicament(new AdapterMedicament(medicamentSpital));
        vindeMedicament(new AdapterMedicament(medicamentSpital1));
    }
}