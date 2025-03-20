package main;

import clase.ARezervare;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        ARezervare rezervare1 = new Rezervare("Ioana", 4, "20.03.2025", "12:00");
        ARezervare rezervare2 = rezervare1.clone();
        ARezervare rezervare3 = rezervare1.clone();

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
        System.out.println(rezervare3.toString());
    }
}