package E9_Composite.main;

import E9_Composite.clase.Loc;
import E9_Composite.clase.Sectiune;
import E9_Composite.clase.Subsectiune;

public class Main {
   public static void main(String[] args) throws Exception {
       Loc subsectiune1 = new Subsectiune("Tribuna Nord");
       Loc subsectiune2 = new Subsectiune("Tribuna Sud");
       Loc subsectiune3 = new Subsectiune("Peluza Nord");
       Loc subsectiune4 = new Subsectiune("Copii");
       Loc subsectiune5 = new Subsectiune("Peluza Sud");

       Loc sectiune1 = new Sectiune("Tribuna");
       Loc sectiune2 = new Sectiune("Peluza");

       sectiune1.adaugaLoc(subsectiune1);
       sectiune1.adaugaLoc(subsectiune2);
       sectiune1.stergeLoc(subsectiune1);
       sectiune1.adaugaLoc(subsectiune1);
       sectiune1.adaugaLoc(subsectiune4);

       sectiune2.adaugaLoc(subsectiune3);
       sectiune2.adaugaLoc(subsectiune5);

       sectiune1.afiseazaDetalii();
       sectiune2.afiseazaDetalii();

   }
}
