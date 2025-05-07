package Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    private Map<String, Flyweight> clienti;

    public Fabrica() {
        this.clienti = new HashMap<String, Flyweight>();
    }

   public Flyweight getRezervare(int nrMasa, int nrPersoane,  String oraRezervare, String dataRezervare) {
        String cheie = "" + nrMasa + " " + nrPersoane + " " + oraRezervare + " " + dataRezervare;
        Flyweight flyweight = this.clienti.get(cheie);
        if (flyweight == null) {
            flyweight = new Masa(nrMasa, nrPersoane, oraRezervare, dataRezervare);
            this.clienti.put(cheie, flyweight);
        }
        return flyweight;
   }
}
