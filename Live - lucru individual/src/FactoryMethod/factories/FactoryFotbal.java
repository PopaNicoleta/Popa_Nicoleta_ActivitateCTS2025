package FactoryMethod.factories;

import FactoryMethod.clase.Fotbal;
import FactoryMethod.clase.Sport;
import Prototype.clase.Live;

public class FactoryFotbal implements FactorySport{
    @Override
    public Sport creeazaTransmisiune(String echipaGazda, String echipaOaspete, Live live) {
        return new Fotbal(echipaGazda, echipaOaspete, live);
    }
}
