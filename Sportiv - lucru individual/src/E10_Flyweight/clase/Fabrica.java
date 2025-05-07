package E10_Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    Map<String, Flyweight> persoane;

    public Fabrica() {
        this.persoane = new HashMap<String, Flyweight>();
    }

    public Flyweight getPersoane(int rand, String culoareTricou) {
        String cheie = "" + rand + " " +  culoareTricou;
        Flyweight flyweight = this.persoane.get(cheie);
        if(flyweight == null) {
            flyweight = new Persoana(rand, culoareTricou);
            this.persoane.put(cheie, flyweight);
        }
        return flyweight;
    }
}
