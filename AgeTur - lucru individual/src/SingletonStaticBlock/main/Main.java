package SingletonStaticBlock.main;

import SingletonStaticBlock.clase.Agentie;

public class Main {
    public static void main(String[] args) {

        Agentie agentie = Agentie.getInstance("AgBooking", 32, "Str. Garoafei, Nr. 34");
        System.out.println(agentie);

        Agentie agentie1 = Agentie.getInstance("Booking", 20, "Str. Lalelei, Nr. 11");
        System.out.println(agentie1);
    }
}