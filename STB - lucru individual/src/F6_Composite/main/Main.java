package F6_Composite.main;

import F6_Composite.clase.Autobuz;
import F6_Composite.clase.GrupMare;
import F6_Composite.clase.GrupMediu;
import F6_Composite.clase.GrupMic;

public class Main {
    public static void main(String[] args) throws Exception {

        Autobuz grupMic1 = new GrupMic("producator 1", "model 1", 8);
        Autobuz grupMic2 = new GrupMic("producator 2", "model 2", 6);
        Autobuz grupMic3 = new GrupMic("producator 1", "model 2", 16);

        Autobuz grupMediu1 = new GrupMediu("producator 3", "model 3", 27);
        Autobuz grupMediu2 = new GrupMediu("producator 4", "model 4", 30);
        Autobuz grupMediu3 = new GrupMediu("producator 5", "model 5", 32);

        Autobuz grupMare1 = new GrupMare("producator 1", "model 7", 39);
        Autobuz grupMare2 = new GrupMare("producator 2", "model 8", 59);

        grupMare1.adaugaAutobuz(grupMediu1);
        grupMare1.adaugaAutobuz(grupMediu2);

        grupMare2.adaugaAutobuz(grupMediu3);

        grupMediu1.adaugaAutobuz(grupMic2);
        grupMediu1.adaugaAutobuz(grupMic1);
        grupMediu1.adaugaAutobuz(grupMic3);

        grupMediu2.adaugaAutobuz(grupMic2);
        grupMediu2.adaugaAutobuz(grupMic3);

        grupMediu3.adaugaAutobuz(grupMic1);

        grupMare1.afiseazaDetalii();
        grupMare2.afiseazaDetalii();


    }
}
