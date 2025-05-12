package A12_Observer.subiect;

import A12_Observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Subiect {
    private String nume;
    private List<Observer> abonati;

    public Spital(String nume) {
        this.nume = nume;
        this.abonati = new ArrayList<Observer>();
    }

    @Override
    public void adaugaAbonat(Observer observer) {
        this.abonati.add(observer);
    }

    @Override
    public void eliminaAbonat(Observer observer) {
        this.abonati.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(int i = 0; i < this.abonati.size(); i++) {
            abonati.get(i).primesteNotificare(mesaj);
        }
    }
}
