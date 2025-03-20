package ro.cts.seminar2.finantari;

import ro.cts.seminar2.clase.Aplicant;

public class AfiseazaFinantare {
    public static void afiseaza(Aplicant aplicant) {
        System.out.println(aplicant.getNume() + " " + aplicant.getPrenume() +
                " primește " + aplicant.getSumaFinantata() + " Euro/zi în proiect.");
    }
}
