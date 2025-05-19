package B11_Strategy.main;

import B11_Strategy.clase.Client;
import B11_Strategy.clase.Plata;
import B11_Strategy.clase.PlataCard;
import B11_Strategy.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Sandra");
        Plata plataCard = new PlataCard();
        client1.setModalitatePlata(plataCard);
        client1.plateste(200);

        Client client2 = new Client("Sandra");
        Plata plataCash = new PlataCash();
        client2.setModalitatePlata(plataCash);
        client2.plateste(210);
    }
}
