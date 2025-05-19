package A7_Decorator.main;

import A7_Decorator.clase.Afisare;
import A7_Decorator.clase.RezultateDecorate;
import A7_Decorator.clase.RezultateOnline;
import A7_Decorator.clase.RezultatePrintate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> rezultate = new ArrayList<Double>();
        rezultate.add(1.9);
        rezultate.add(2.34);
        rezultate.add(0.98);

        Afisare rezultatePrintate = new RezultatePrintate("Anabela", rezultate);
        rezultatePrintate.afisareRezultate();

        RezultateDecorate rezultateDecorate = new RezultateOnline(rezultatePrintate);
        rezultateDecorate.afisareRezultate();
    }
}
