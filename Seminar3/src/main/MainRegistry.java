package main;

import singletonRegistry.AutoritatePescuit;
import singletonRegistry.Autorizatie;

public class MainRegistry {
    public static void main(String[] args) {
        AutoritatePescuit autoritatePescuit = AutoritatePescuit.getInstance();
        Autorizatie autorizatie = autoritatePescuit.emiteAutorizatie("Marian");
        System.out.println(autorizatie.toString());
    }
}
