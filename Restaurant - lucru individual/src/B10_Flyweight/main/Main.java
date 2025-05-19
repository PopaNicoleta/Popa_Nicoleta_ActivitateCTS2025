package B10_Flyweight.main;

import B10_Flyweight.clase.Client;
import B10_Flyweight.clase.Masa;
import B10_Flyweight.clase.Rezervare;
import B10_Flyweight.clase.RezervareFlyweight;

public class Main {
    public static void main(String[] args) {
        RezervareFlyweight flyweight = new RezervareFlyweight();

        Client client1 = (Client) flyweight.getClient("Ion Popescu", "0723123456", "ion@email.com");

        Masa masa1 = new Masa(10, 3, "18:00");
        Masa masa2 = new Masa(15, 2, "20:00");
        Masa masa3 = new Masa(5, 4, "21:30");

        flyweight.getClient("Ion Popescu", "0723123456", "ion@email.com").afiseazaDetalii(masa1);
        flyweight.getClient("Ion Popescu", "0723123456", "ion@email.com").afiseazaDetalii(masa2);
        flyweight.getClient("Ion Popescu", "0723123456", "ion@email.com").afiseazaDetalii(masa3);

    }
}
