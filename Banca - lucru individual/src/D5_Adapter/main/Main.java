package D5_Adapter.main;

import D5_Adapter.clase.*;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Maria", 27);
        AcordaCredit credit = new Credit(client, 20000);
        credit.acordaCredit();

        AcordaCredit creditLeasing1 = new AdaptorCredit(new Credit(new Client("Andrei", 17), 130000));
        creditLeasing1.acordaCredit();

        AcordaCredit creditLeasing2 = new CreditLeasing(client, "masina", 12000);
        creditLeasing2.acordaCredit();
    }
}
