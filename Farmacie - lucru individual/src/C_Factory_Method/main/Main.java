package C_Factory_Method.main;

import C_Factory_Method.clase.Medicament;
import C_Factory_Method.factories.FactoryMedicamentBody;
import C_Factory_Method.factories.FactoryMedicamentDurere;
import C_Factory_Method.factories.FactoryMedicamentRaceala;
import C_Factory_Method.factories.IFactoryMedicamente;

public class Main {
    public static void main(String[] args) {

        IFactoryMedicamente factoryMedicamentDurere = new FactoryMedicamentDurere();
        Medicament medicamentDurere = factoryMedicamentDurere.creazaMedicament("Nurofen", 42.5);
        System.out.println(medicamentDurere);

        IFactoryMedicamente factoryMedicamentBody = new FactoryMedicamentBody();
        Medicament medicamentBody = factoryMedicamentBody.creazaMedicament("Alifie chinezeasca", 22.9);
        System.out.println(medicamentBody);

        IFactoryMedicamente factoryMedicamentRaceala = new FactoryMedicamentRaceala();
        Medicament medicamentRaceala = factoryMedicamentRaceala.creazaMedicament("Strepsils", 34.99);
        System.out.println(medicamentRaceala);
    }
}