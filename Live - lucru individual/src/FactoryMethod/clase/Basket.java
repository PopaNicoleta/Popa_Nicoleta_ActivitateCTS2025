package FactoryMethod.clase;

import Prototype.clase.Live;

public class Basket extends Sport{

    public Basket(String echipaGazda, String echipaOaspete , Live live) {
        super(echipaGazda, echipaOaspete, live);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Meci de basket intre " + this.getEchipaGazda() + " vs. " + this.getEchipaOaspete() + ". Detaliile live-ului sunt: " + this.getLive().toString());
    }
}
