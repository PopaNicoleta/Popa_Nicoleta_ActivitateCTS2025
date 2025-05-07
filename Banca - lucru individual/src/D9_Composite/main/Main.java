package D9_Composite.main;

import D9_Composite.clase.Agentie;
import D9_Composite.clase.Filiala;
import D9_Composite.clase.Item;
import D9_Composite.clase.Sucursala;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Item filiala1 = new Filiala("Filiala 1");
        Item filiala2 = new Filiala("Filiala 2");
        Item filiala3 = new Filiala("Filiala 3");

        Agentie agentia1 = new Agentie("Agentia 1");
        Agentie agentia2 = new Agentie("Agentia 2");
        Agentie agentia3 = new Agentie("Agentia 3");

        Sucursala sucursala1 = new Sucursala("Sucursala 1");
        Sucursala sucursala2 = new Sucursala("Sucursala 2");

        sucursala1.adaugaItem(agentia1);

        sucursala2.adaugaItem(agentia2);
        sucursala2.adaugaItem(agentia3);
        sucursala2.stergeItem(agentia1);
        sucursala2.adaugaItem(agentia1);

        agentia2.adaugaItem(filiala2);
        agentia3.adaugaItem(filiala2);
        agentia1.adaugaItem(filiala1);
        agentia1.adaugaItem(filiala3);

        sucursala1.afiseazaDetalii();
        sucursala2.afiseazaDetalii();

    }
}
