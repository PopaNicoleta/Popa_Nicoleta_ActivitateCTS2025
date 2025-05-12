package A11_Strategy.main;

import A11_Strategy.clase.Client;
import A11_Strategy.clase.Plata;
import A11_Strategy.clase.PlataCard;
import A11_Strategy.clase.PlataCash;

public class Main {
    public static void main(String[] args){
        Client client1 = new Client("Popescu", "Maria");
        Client client2 = new Client("Vasilescu", "Vasile");

        Plata plataCash = new PlataCash();
        Plata plataCard = new PlataCard();

        client1.alegeModalitateaDePlata(plataCard);
        client2.alegeModalitateaDePlata(plataCash);

        client2.plateste(160);
        client1.plateste(200);
    }
}
