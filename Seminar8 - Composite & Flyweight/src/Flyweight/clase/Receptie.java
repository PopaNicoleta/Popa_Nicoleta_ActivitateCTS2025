package Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class Receptie {
    Map<String, IPacientAbstarct> pacienti;

    public Receptie() {
        this.pacienti = new HashMap<String, IPacientAbstarct>();
    }

    public IPacientAbstarct getPacienti(String nume, String nrTelefon, String adresa) {
        String cheie = nume;
        IPacientAbstarct flyweight = this.pacienti.get(cheie);
        if(flyweight == null) {
            flyweight = new Pacient(nume, nrTelefon, adresa);
            this.pacienti.put(cheie, flyweight);
        }
        return flyweight;
    }

    public IPacientAbstarct getPacientiV2(String nume) throws Exception {
        if(this.pacienti.containsKey(nume)) {
            return this.pacienti.get(nume);
        } else{
            throw new Exception("Exceptie");
        }
    }
}
