package FactoryMethod.clase;

import Prototype.clase.Live;

public class Fotbal extends Sport{

    public Fotbal(String echipaGazda, String echipaOaspete, Live live) {
        super(echipaGazda, echipaOaspete, live);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Meci de fotbal intre " + this.getEchipaGazda() + " vs. " + this.getEchipaOaspete() + ". Detaliile live-ului sunt: " + this.getLive().toString());
    }
}
