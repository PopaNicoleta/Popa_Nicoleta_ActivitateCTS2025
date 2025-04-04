package SingletonLazy.main;

import SingletonLazy.clase.Agentie;

public class Main {
    public static void main(String[] args) {
        Agentie agentie = Agentie.getInstance("AgeTur", 12, "Str. Amurgului, Nr. 34");
        System.out.println(agentie);

        Agentie agentie1 = Agentie.getInstance("Booking", 20, "Str. Lalelei, Nr. 11");
        System.out.println(agentie1);
    }
}