package D8_Proxy.main;

import D8_Proxy.clase.*;

public class Main {
    public static void main(String[] args){
        Client client = new Client("Marinescu Andrei", "4998032232", 27);
        ICredit credit1 = new Credit(client, Moneda.Rubla, 20000);

        ICredit creditProxy1 = new ProxyMoneda((Credit)credit1);
        creditProxy1.creeazaCredit();

        System.out.println("");

        ICredit creditProxy2 = new ProxyMoneda(new Credit(new Client("Andronescu Simona", "3453858332324", 40), Moneda.RON, 12000));
        creditProxy2.creeazaCredit();
    }
}
