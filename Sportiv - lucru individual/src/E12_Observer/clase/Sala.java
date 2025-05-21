package E12_Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Sala implements Subject {
    private String numeSala;
    private List<Observer> clientiAbonati;

    public Sala(String numeSala) {
        this.numeSala = numeSala;
        this.clientiAbonati = new ArrayList<Observer>();
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Observer client: this.clientiAbonati){
            client.primesteMesaj(this.numeSala + " te anunta ca " + mesaj);
        }
    }

    @Override
    public void adaugaClient(Observer observer) {
        this.clientiAbonati.add(observer);
    }

    @Override
    public void stergeClient(Observer observer) {
        this.clientiAbonati.remove(observer);
    }

}
