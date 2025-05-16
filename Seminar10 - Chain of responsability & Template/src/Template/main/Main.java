package Template.main;

import Template.clase.AMetrou;
import Template.clase.Metrou;
import Template.clase.MetrouSpecial;

public class Main {
    public static void main(String[] args) {
        AMetrou metrou1 = new Metrou(1);
        metrou1.circulaTur();
        metrou1.circulaRetur();

        System.out.println("\n");

        AMetrou metrou2 = new MetrouSpecial();
        metrou2.circulaTur();
        metrou2.circulaRetur();

    }
}
