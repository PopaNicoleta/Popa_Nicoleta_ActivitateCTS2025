package Strategy.main;

import Strategy.clase.*;

public class Main {
    public static void main(String[] args){

        Calator calator2 = new Calator("Costel");

        Plata plataSMS = new PlataSMS();
        Plata plataCardBancar = new PlataCardBancar(4);
        Plata plataCardCalatorii = new PlataCardCalatorii(6);

        calator2.setModalitatePlata(plataSMS);
        calator2.platesteBilet(10);

        calator2.setModalitatePlata(plataCardCalatorii);
        calator2.platesteBilet(3);

        calator2.setModalitatePlata(plataCardBancar);
        calator2.platesteBilet(9);

        calator2.setModalitatePlata(plataSMS);
        calator2.platesteBilet(10);
    }
}