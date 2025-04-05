package C_Factory_Method.factories;

import C_Factory_Method.clase.Medicament;

public interface IFactoryMedicamente {
    public Medicament creazaMedicament(String denumire, double pret);
}
