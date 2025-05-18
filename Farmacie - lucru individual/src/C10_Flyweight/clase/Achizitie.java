package C10_Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class Achizitie {
    private HashMap<Integer, Detalii> clienti;

    public Achizitie() {
        this.clienti = new HashMap<Integer, Detalii>();
    }

    public Detalii getClient(String nume, int numarAsigurare, int varsta){
        int cheie = numarAsigurare;
        Detalii flyweight = this.clienti.get(numarAsigurare);
        if(flyweight == null) {
            flyweight = new Client(nume, numarAsigurare, varsta);
            clienti.put(cheie, flyweight);
        }
        return flyweight;
    }
}
