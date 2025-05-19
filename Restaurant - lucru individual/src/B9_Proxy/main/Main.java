package B9_Proxy.main;

import B9_Proxy.clase.IRezervare;
import B9_Proxy.clase.Rezervare;
import B9_Proxy.clase.RezervareProxy;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        rezervare.realizeazaRezervare("Maria", 2);

        IRezervare rezervareProxy = new RezervareProxy(rezervare);
        rezervareProxy.realizeazaRezervare("Maria", 2);
    }
}
