package AdapterClase.main;

import AdapterClase.clase.AdapterMedicament;
import AdapterClase.clase.Farmacie;
import AdapterClase.clase.IMedicamentFarmacie;
import AdapterClase.clase.MedicamentFarmacie;
import AdapterClase.clase.MedicamentSpital;

import javax.imageio.metadata.IIOMetadata;

public class Main {

    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Catena");
        IMedicamentFarmacie iMedicamentFarmacie = new MedicamentFarmacie("Paracetamol", 5, true);
        farmacie.vindeMedicament(iMedicamentFarmacie);

        MedicamentSpital medicamentSpital = new MedicamentSpital("Nurofen", 40);
        AdapterMedicament adapterMedicament = new AdapterMedicament("Nurofen", 40);
        farmacie.vindeMedicament(adapterMedicament);
    }
}