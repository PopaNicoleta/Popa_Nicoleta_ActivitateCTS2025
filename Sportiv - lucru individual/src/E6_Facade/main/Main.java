package E6_Facade.main;

import E6_Facade.clase.Client;
import E6_Facade.clase.VerificaFacade;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Andrei", true, true);
        Client client2 = new Client("Marian", true, false);
        Client client3 = new Client("Andreea", false, true);
        Client client4 = new Client("Cosmin", false, false);

        VerificaFacade facade = new VerificaFacade();

        facade.verificaClient(client1, "Marius");

        System.out.println("");
        facade.verificaClient(client2, "Marian");

        System.out.println("");
        facade.verificaClient(client3, "Andreea");

        System.out.println("");
        facade.verificaClient(client4, "Cosmin");
    }
}
