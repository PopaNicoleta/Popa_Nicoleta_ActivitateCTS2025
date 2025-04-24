package Proxy.main;

import Facade.clase.Facade;
import Facade.clase.Masa;
import Proxy.clase.IRezervare;
import Proxy.clase.ProxyNumeClient;
import Proxy.clase.ProxyRezervare;
import Proxy.clase.Rezervare;

public class Main {
    public static void main(String[] args) {

        IRezervare rezervare = new Rezervare();
        IRezervare proxy = new ProxyRezervare(rezervare);

        proxy.realizeazaRezervare("Maria Popescu", 4);
        proxy.realizeazaRezervare("Marius Pop", 2);

        IRezervare proxyNume = new ProxyNumeClient(rezervare);
        proxyNume.realizeazaRezervare("Pop", 6);
        proxyNume.realizeazaRezervare("Marius", 2);
    }
}