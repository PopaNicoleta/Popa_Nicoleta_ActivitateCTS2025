package FactoryMethod.factories;

import FactoryMethod.clase.Handbal;
import FactoryMethod.clase.Sport;
import Prototype.clase.Live;

public class FactoryHandbal implements FactorySport{

    @Override
    public Sport creeazaTransmisiune(String echipaGazda, String echipaOaspete, Live live) {
        return new Handbal(echipaGazda, echipaOaspete, live);
    }
}
