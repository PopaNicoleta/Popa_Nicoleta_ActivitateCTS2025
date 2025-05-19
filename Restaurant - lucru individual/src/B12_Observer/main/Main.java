package B12_Observer.main;

import B12_Observer.clase.Client;
import B12_Observer.clase.Observer;
import B12_Observer.clase.Restaurant;
import B12_Observer.clase.Subject;

public class Main {
    public static void main(String[] args) {
        Observer client1 = new Client("Marcel");
        Observer client2 = new Client("Gigel");

        Subject restaurant = new Restaurant("Casa di David");
        restaurant.adaugaClientFildel(client1);
        restaurant.adaugaClientFildel(client2);

        restaurant.anuntaIntroducereMeniu(" tocmai a fost introdus un meniu nou!");
        restaurant.stergeClientFildel(client1);
        restaurant.anuntaOferta(" la urmatoarea masa, primiti o bautura din partea casei!");
    }
}
