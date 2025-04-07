package FactoryMethod.clase;

import Prototype.clase.Live;

public abstract class Sport {
    private String echipaGazda;
    private String echipaOaspete;
    private Live live;

    public Sport(String echipaGazda, String echipaOaspete, Live live) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
        this.live = live;
    }

    public String getEchipaGazda() {
        return echipaGazda;
    }

    public String getEchipaOaspete() {
        return echipaOaspete;
    }

    public Live getLive() {
        return live;
    }

    public abstract void afiseazaDetalii();
}
