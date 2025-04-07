package main;

import FactoryMethod.clase.Basket;
import FactoryMethod.clase.Sport;
import FactoryMethod.factories.FactoryBasket;
import FactoryMethod.factories.FactoryFotbal;
import FactoryMethod.factories.FactoryHandbal;
import FactoryMethod.factories.FactorySport;
import Prototype.clase.ConcreteLive;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> comentariiOriginal = new LinkedHashMap<>();
        comentariiOriginal.put("Andrei", "Ce meci tareeee!");
        ConcreteLive liveOriginal = new ConcreteLive("Finala Campionatului Mondial", "YouTube", 500000, comentariiOriginal);
        System.out.println("Live Original (YouTube) creat:");
        System.out.println(liveOriginal);

        ConcreteLive liveTwitch = (ConcreteLive) liveOriginal.clone();
        liveTwitch.setPlatforma("Twitch");
        Map<String, String> comentariiTwitch = new LinkedHashMap<>();
        comentariiTwitch.put("Elena", "GOOOOL!!!");
        liveTwitch.setComentariiViewers(comentariiTwitch);
        System.out.println("Live Twitch:");
        System.out.println(liveTwitch);

        ConcreteLive liveTikTok = (ConcreteLive) liveOriginal.clone();
        liveTikTok.setPlatforma("TikTok");
        Map<String, String> comentariiTikTok = new LinkedHashMap<>();
        comentariiTikTok.put("David", "Sunt aici doar pentru vibe:)))");
        liveTikTok.setComentariiViewers(comentariiTikTok);
        System.out.println("Live TikTok:");
        System.out.println(liveTikTok);

        System.out.println("Live Original dupa clonari:");
        System.out.println(liveOriginal);
        System.out.println("\n");


        FactorySport factoryBasket = new FactoryBasket();
        Sport basket = factoryBasket.creeazaTransmisiune("echipa 1", "echipa 2", liveOriginal);
        basket.afiseazaDetalii();

        FactorySport factoryFotbal = new FactoryFotbal();
        Sport fotbal =factoryFotbal.creeazaTransmisiune("Dinamo", "Steaua", liveTwitch);
        fotbal.afiseazaDetalii();

        FactorySport factoryHandbal = new FactoryHandbal();
        Sport handbal = factoryHandbal.creeazaTransmisiune("echipa 3", "echipa 4", liveTikTok);
        handbal.afiseazaDetalii();
    }
}