package C_Factory_Method.factories;

import C_Factory_Method.clase.Medicament;
import C_Factory_Method.clase.MedicamentBody;

public class FactoryMedicamentBody implements IFactoryMedicamente{

    @Override
    public Medicament creazaMedicament(String denumire, double pret) {
        return new MedicamentBody(denumire,pret);
    }
}
