package FactoryMethod.factories;

import FactoryMethod.clase.Sport;
import Prototype.clase.Live;

public interface FactorySport {
    public Sport creeazaTransmisiune(String echipaGazda, String echipaOaspete, Live live);
}
