package F10_Strategy.main;

import F10_Strategy.clase.Calator;
import F10_Strategy.clase.PlataCardBancar;
import F10_Strategy.clase.PlataCardCalatorii;
import F10_Strategy.clase.PlataSMS;

public class Main {
    public static void main(String[] args) {
        Calator calator = new Calator("Andreea");

        calator.setModPlata(new PlataSMS());
        calator.plateste(3);

        System.out.println("");

        calator.setModPlata(new PlataCardBancar());
        calator.plateste(3);

        System.out.println("");

        calator.setModPlata(new PlataCardCalatorii());
        calator.plateste(3);
    }
}
