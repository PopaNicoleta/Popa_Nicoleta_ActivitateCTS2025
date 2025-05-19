package C12_Observer.main;

import C12_Observer.clase.Client;
import C12_Observer.clase.Farmacie;
import C12_Observer.clase.Object;
import C12_Observer.clase.Observer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Observer client1 = new Client("Maria");
        Observer client2 = new Client("Ana");
        Observer client3 = new Client("Mario");
        Observer client4 = new Client("Andrei");

        List<Observer> clientiAbonati = new ArrayList<Observer>();
        clientiAbonati.add(client1);
        clientiAbonati.add(client2);
        clientiAbonati.add(client3);
        clientiAbonati.add(client4);

        Object farmacie = new Farmacie("Farmacia Tei", clientiAbonati);

        farmacie.eliminaClient(client1);

        farmacie.anunta("Ai primit un voucher de 10% pentru produsele din gama raceala si gripa!");
    }
}
