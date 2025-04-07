package FactoryMethod.factories;

import FactoryMethod.clase.Basket;
import FactoryMethod.clase.Sport;
import Prototype.clase.Live;

public class FactoryBasket implements FactorySport {
    @Override
    public Sport creeazaTransmisiune(String echipaGazda, String echipaOaspete, Live live) {
        return new Basket(echipaGazda, echipaOaspete, live);
    }
}
