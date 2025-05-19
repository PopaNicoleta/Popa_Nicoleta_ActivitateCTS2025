package A8_Composite.main;
import A8_Composite.clase.Departament;
import A8_Composite.clase.Sectie;
import A8_Composite.clase.Subdepartament;
import A8_Composite.clase.Item;


public class Main {
    public static void main(String[] args) {
        Item sectie1 = new Sectie("Sectia 1");
        Item sectie2 = new Sectie("Sectia 2");
        Item sectie3 = new Sectie("Sectia 3");
        Item sectie4 = new Sectie("Sectia 4");

        Item subdepartament1 = new Subdepartament("Subdepartament 1");
        Item subdepartament2 = new Subdepartament("Subdepartament 2");
        Item subdepartament3 = new Subdepartament("Subdepartament 3");
        Item subdepartament4 = new Subdepartament("Subdepartament 4");

        Item departament1 = new Departament("Departament 1");
        Item departament2 = new Departament("Departament 2");

        try{
            departament1.adaugaItem(sectie1);
            departament1.stergeItem(sectie1);
            departament1.adaugaItem(sectie2);
            departament1.adaugaItem(subdepartament1);
            departament1.adaugaItem(subdepartament4);

            departament2.adaugaItem(subdepartament4);
            departament2.adaugaItem(subdepartament3);
            departament2.adaugaItem(sectie3);
            departament2.stergeItem(sectie3);
            departament2.adaugaItem(sectie4);
            departament2.adaugaItem(subdepartament2);

            departament1.afiseazaItem();
            departament2.afiseazaItem();

        } catch(Exception e){
            throw new RuntimeException();
        }

    }
}
