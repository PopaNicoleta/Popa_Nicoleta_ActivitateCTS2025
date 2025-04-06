package E4_Prototype.main;


import E4_Prototype.clase.AClient;
import E4_Prototype.clase.Client;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> rezervariAnterioare = new HashMap<>();
        rezervariAnterioare.put(1, "12-12-2024");
        rezervariAnterioare.put(2, "30-03-2025");
        AClient client = new Client("Maria", "Popescu", "234943320943", 18, rezervariAnterioare);
        System.out.println(client.toString());

        AClient clona = client.clone();
        System.out.println(clona.toString());
    }
}