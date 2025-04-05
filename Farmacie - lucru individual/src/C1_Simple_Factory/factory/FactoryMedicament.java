package C1_Simple_Factory.factory;

import C1_Simple_Factory.clase.Medicament;
import C1_Simple_Factory.clase.MedicamentBody;
import C1_Simple_Factory.clase.MedicamentDurere;
import C1_Simple_Factory.clase.MedicamentRaceala;

public class FactoryMedicament {
    public Medicament creazaMedicament(TipMedicament tip, String denumire, float pret, int cantitate, int extra) {
        return switch (tip) {
            case Body -> new MedicamentBody(denumire, pret, cantitate, extra);
            case Raceala -> new MedicamentRaceala(denumire, pret, cantitate, extra);
            case Durere -> new MedicamentDurere(denumire, pret, cantitate, extra);
            default -> null;
        };
    }
}
