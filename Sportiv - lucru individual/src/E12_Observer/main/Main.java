package E12_Observer.main;

import E12_Observer.clase.Client;
import E12_Observer.clase.Observer;
import E12_Observer.clase.Sala;
import E12_Observer.clase.Subject;

public class Main {
    public static void main(String[] args){
        Observer client1 = new Client("Marius");
        Observer client2 = new Client("Andrei");

        Subject sala = new Sala("WinFit");

        sala.adaugaClient(client1);
        sala.adaugaClient(client2);
        sala.stergeClient(client1);

        sala.trimiteMesaj("o sa fie un meci intre Barcelona si Real Madrid!");

        System.out.println("");
        sala.adaugaClient(client1);
        sala.trimiteMesaj("o sa fie un meci de voley pe data de 12.06.2025");

    }
}
