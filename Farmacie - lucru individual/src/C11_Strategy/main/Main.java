package C11_Strategy.main;

import C11_Strategy.clase.Client;
import C11_Strategy.clase.ModPlata;
import C11_Strategy.clase.PlataCard;
import C11_Strategy.clase.PlataCash;

public class Main {
    public  static void main(String[] args) {
        ModPlata plataCash = new PlataCash(20);
        Client client1 = new Client("Maria");
        client1.setModPlata(plataCash);
        client1.plateste(13);

        ModPlata plataCard = new PlataCard(40);
        client1.setModPlata(plataCard);
        client1.plateste(2);
    }

}
