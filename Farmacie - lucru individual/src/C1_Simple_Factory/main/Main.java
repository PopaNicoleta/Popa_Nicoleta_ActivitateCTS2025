package C1_Simple_Factory.main;

import C1_Simple_Factory.clase.Medicament;
import C1_Simple_Factory.factory.FactoryMedicament;
import C1_Simple_Factory.factory.TipMedicament;

public class Main {
    public static void main(String[] args) {

        FactoryMedicament factoryMedicament = new FactoryMedicament();
        Medicament medicamentRaceala = factoryMedicament.creazaMedicament(TipMedicament.Raceala, "FaringoSept", 36, 2, 3);
        System.out.println(medicamentRaceala);

        Medicament medicamentBody = factoryMedicament.creazaMedicament(TipMedicament.Body, "Diclofenal", 40, 2, 2021);
        System.out.println(medicamentBody);

        Medicament medicamentDurere = factoryMedicament.creazaMedicament(TipMedicament.Durere, "Nurofen", 42, 3, 3);
        System.out.println(medicamentDurere);
    }
}