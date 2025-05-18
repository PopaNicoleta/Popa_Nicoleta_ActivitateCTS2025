package C6_Facade.main;

import C6_Facade.clase.Client;
import C6_Facade.clase.Facade;
import C6_Facade.clase.Medicament;
import C6_Facade.clase.Reteta;

public class Main {
    public static void main(String[] args) {

        Medicament medicament1 = new Medicament(23, "Paracetamol", 5);
        Client client1 = new Client("Marian", true);
        Client client2 = new Client("Marinela", false);

        Reteta reteta1 = new Reteta(2323, client1, medicament1, 6);
        Reteta reteta2 = new Reteta(4040, client2, medicament1, 2);
        Reteta  reteta3 = new Reteta(5000, client1, medicament1, 3);

        Facade facade = new Facade(client1, reteta1, medicament1);
        facade.cumparaMedicament(2323);

        System.out.println("");
        facade.cumparaMedicament(4323);

        System.out.println("");
        Facade facade2 = new Facade(client2, reteta2, medicament1);
        facade2.cumparaMedicament(4040);

        System.out.println("");
        Facade facade3 = new Facade(client1, reteta3, medicament1);
        facade3.cumparaMedicament(5000);
    }

}
