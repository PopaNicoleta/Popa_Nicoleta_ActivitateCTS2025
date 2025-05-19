package C14_Template.main;

import C14_Template.clase.GestiuneMedicamente;
import C14_Template.clase.GestiuneMedicamenteTemplate;
import C14_Template.clase.Medicament;
import C14_Template.clase.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Medicament medicament1 = new Medicament("Paracetamol", 2);
        Medicament medicament2 = new Medicament("Ibuprofen", 3);

        List<Medicament> listaMedicamente = new ArrayList<Medicament>();
        listaMedicamente.add(medicament1);
        listaMedicamente.add(medicament2);

        Reteta reteta = new Reteta(101, listaMedicamente, 140);

        GestiuneMedicamenteTemplate achizitie = new GestiuneMedicamente();
        achizitie.achizitioneaza(reteta);
    }
}
