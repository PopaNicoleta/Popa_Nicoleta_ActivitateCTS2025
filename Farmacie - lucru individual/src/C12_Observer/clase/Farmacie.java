package C12_Observer.clase;

import java.util.List;

public class Farmacie implements Object {
    private String nume;
    private List<Observer> clientiAbonati;

    public Farmacie(String nume, List<Observer> clientiAbonati) {
        this.nume = nume;
        this.clientiAbonati = clientiAbonati;
    }

    @Override
    public void adaugaClient(Observer client) {
        this.clientiAbonati.add(client);
    }

    @Override
    public void eliminaClient(Observer client) {
        this.clientiAbonati.remove(client);
    }

    @Override
    public void anunta(String mesaj) {
        for(Observer client : this.clientiAbonati) {
            client.primesteNotificare(mesaj);
        }
    }
}
