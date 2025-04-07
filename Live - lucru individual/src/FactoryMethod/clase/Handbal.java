package FactoryMethod.clase;

import Prototype.clase.ConcreteLive;
import Prototype.clase.Live;

public  class Handbal extends Sport{

    public Handbal(String echipaGazda, String echipaOaspete, Live live) {
        super(echipaGazda, echipaOaspete, live);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Meci de handbal intre " + this.getEchipaGazda() + " vs. " + this.getEchipaOaspete() + ". Detaliile live-ului sunt: " + this.getLive().toString());

    }
}
