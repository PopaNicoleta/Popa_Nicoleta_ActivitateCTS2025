package Observer.main;

import Observer.clase.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Observator calator1 = new Calator("Marian");
        Observator calator2 = new Calator("Maria");
        Observator calator3 = new Calator("Catalin");

        MijlocTransport mijlocTransport = new Autobuz(12);

        mijlocTransport.adaugaObservator(calator1);
        mijlocTransport.adaugaObservator(calator2);
        mijlocTransport.adaugaObservator(calator3);

        mijlocTransport.anuntaPlecare();
        mijlocTransport.eliminaObservator(calator1);
        ((Autobuz)mijlocTransport).schimbareRuta();
    }
}