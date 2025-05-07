package C8_Composite.main;

import C8_Composite.clase.Item;
import C8_Composite.clase.Sectiune;
import C8_Composite.clase.Subsectiune;

public class Main {
    public static void main(String[] args) {

        Item adulti = new Subsectiune("adulti", 18);
        Item copii = new Subsectiune("copii", 2);
        Item adolescenti = new Subsectiune("adolescenti", 14);

        Sectiune raceala = new Sectiune("Raceala");
        Sectiune durere = new Sectiune("Durere");

        raceala.adaugaSubsectiune(adolescenti);
        raceala.adaugaSubsectiune(copii);
        raceala.adaugaSubsectiune(adulti);
        raceala.stergeSubsectiune(adulti);

        durere.adaugaSubsectiune(copii);
        durere.stergeSubsectiune(copii);
        durere.adaugaSubsectiune(adulti);

        raceala.afiseaza();
        durere.afiseaza();

    }
}
