package main;

import clase.AutoritatePescuitEager;
import clase.AutoritatePescuitLazy;

public class Main {
    public static void main(String[] args) {

        AutoritatePescuitEager autoritate = AutoritatePescuitEager.getInstance();
        autoritate.concediaza(2);
        System.out.println(autoritate.toString());

        autoritate.setDenumire("ANpPa");
        autoritate.setWebsite("ANpPa.ro");
        System.out.println(autoritate.toString());

        autoritate.emiteAutorizatie("Marian");
        System.out.println(autoritate.toString());


        AutoritatePescuitEager autoritate2 = AutoritatePescuitEager.getInstance();
        autoritate.emiteAutorizatie("Ion");
        System.out.println(autoritate2.toString());

        AutoritatePescuitLazy autoritateLazy = AutoritatePescuitLazy.getInstance("anpa", "anpa.ro", 30, 100);
        System.out.println(autoritateLazy.toString());

        AutoritatePescuitLazy autoritateLazy2 = AutoritatePescuitLazy.getInstance("AnPa", "AnPa.ro", 40, 200);
        System.out.println(autoritateLazy2.toString());
        autoritateLazy2.emiteAutorizatie("Marian");
        System.out.println(autoritateLazy2.toString());

    }
}