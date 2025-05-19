package B10_Flyweight.clase;

import java.util.HashMap;

public class RezervareFlyweight{
    private HashMap<String, Rezervare> clienti;

    public RezervareFlyweight() {
        clienti = new HashMap<String, Rezervare>();
    }

    public Rezervare getClient(String nume, String numarTelefon, String adresaMail) {
        Rezervare flyweight = clienti.get(nume);
        if (flyweight == null) {
            flyweight = new Client(nume, numarTelefon, adresaMail);
            clienti.put(nume, flyweight);
        }
        return flyweight;
    }
}
