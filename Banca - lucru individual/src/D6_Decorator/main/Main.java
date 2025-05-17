package D6_Decorator.main;

import D6_Decorator.clase.*;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Mariana", "45352345345", 37, 10000);
        Client client2 = new Client("Ciprian", "45930353232", 20, 300);

        IPlata plata1 = new Plata(client1, 2000);
        IPlata plata2 = new Plata(client2, 350);

        DecoratorPlata plataOnline1 = new PlataOnline(plata1);
        plataOnline1.efectueazaPlata();

        System.out.println(" ");
        DecoratorPlata plataOnline2 = new PlataOnline(plata2);
        DecoratorPlata plataContactless = new PlataContactless(plataOnline2);
        plataContactless.efectueazaPlata();

    }
}
