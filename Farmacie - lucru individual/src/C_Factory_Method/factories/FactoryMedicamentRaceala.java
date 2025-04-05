package C_Factory_Method.factories;

import C_Factory_Method.clase.Medicament;
import C_Factory_Method.clase.MedicamentRaceala;

public class FactoryMedicamentRaceala implements IFactoryMedicamente{
    @Override
    public Medicament creazaMedicament(String denumire, double pret) {
        return new MedicamentRaceala(denumire, pret);
    }
}
