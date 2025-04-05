package C_Factory_Method.factories;

import C_Factory_Method.clase.Medicament;
import C_Factory_Method.clase.MedicamentDurere;

public class FactoryMedicamentDurere implements IFactoryMedicamente {

    @Override
    public Medicament creazaMedicament(String denumire, double pret) {
        return new MedicamentDurere(denumire,pret);
    }
}
