package B8_Composite.main;

import B8_Composite.clase.Item;
import B8_Composite.clase.Nivel;
import B8_Composite.clase.Sectiune;
import B8_Composite.clase.Subsectiune;

public class Main {
    public static void main(String[] args) {
        Nivel item1 = new Item("apa plata");
        Nivel item2 = new Item("apa minerala");
        Nivel item3 = new Item("pepsi");
        Nivel item4 = new Item("prigat");

        Nivel subsectiune1 = new Subsectiune("apa");
        Nivel subsectiune2 = new Subsectiune("sucuri");

        Nivel sectiune1 = new Sectiune("bauturi");

        Nivel item5 = new Item("cheesecake");
        Nivel item6 = new Item("amandina");
        Nivel item7 = new Item("brownie");

        Nivel subsectiune3 = new Subsectiune("ciocolata");
        Nivel sectiune2 = new Sectiune("deserturi");

        try{
            subsectiune1.adaugaNivel(item1);
            subsectiune1.stergeNivel(item1);
            subsectiune1.adaugaNivel(item2);
            subsectiune1.adaugaNivel(item1);
            subsectiune2.adaugaNivel(item3);
            subsectiune2.adaugaNivel(item4);
            sectiune1.adaugaNivel(subsectiune1);
            sectiune1.adaugaNivel(subsectiune2);

            subsectiune3.adaugaNivel(item5);
            subsectiune3.adaugaNivel(item6);
            subsectiune3.adaugaNivel(item7);
            sectiune2.adaugaNivel(subsectiune3);

            sectiune1.afiseaza();
            sectiune2.afiseaza();

        } catch(Exception e){
            throw new RuntimeException();
        }


    }
}
