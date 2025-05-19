package B12_Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subject{
    private String nume;
    private List<Observer> clientiFildeli;

    public Restaurant(String nume) {
        this.nume = nume;
        clientiFildeli = new ArrayList<Observer>();
    }

    @Override
    public void adaugaClientFildel(Observer client) {
        this.clientiFildeli.add(client);
    }

    @Override
    public void stergeClientFildel(Observer client) {
        this.clientiFildeli.remove(client);
    }

    @Override
    public void anuntaOferta(String mesaj) {
        for(Observer client: this.clientiFildeli){
            client.primesteNotificare(mesaj);
        }
    }

    @Override
    public void anuntaIntroducereMeniu(String mesaj) {
        for(Observer client: this.clientiFildeli){
            client.primesteNotificare(mesaj);
        }
    }
}
