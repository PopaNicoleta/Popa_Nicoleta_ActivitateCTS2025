package SingletonEager.main;

import SingletonEager.clase.Agentie;

public class Main {
    public static void main(String[] args) {
        Agentie agentie = Agentie.getInstance("Booking", 21, "Strada Macului, Nr. 12");
        System.out.println(agentie);
    }
}