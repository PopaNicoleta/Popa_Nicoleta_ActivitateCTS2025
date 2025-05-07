package Flyweight.main;

import Flyweight.clase.Client;
import Flyweight.clase.Fabrica;

public class Main {

    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

        Client client = new Client("Marian", "0757414757", "marian@gmail.com");
        Client client1 = new Client("Alina", "0753080220", "alina@gmail.com");

        fabrica.getRezervare(12, 3, "12:00", "12/05/2025").efectueazaRezervare(client);
        fabrica.getRezervare(2, 6, "13:30", "09/05/2025").efectueazaRezervare(client1);

    }
}
