package main;

import clase.Supa;
import factory.SupaFactory;
import factory.TipSupe;

public class Program {
    public static void main(String[] args) {
        SupaFactory supaFactory = new SupaFactory(200, 10);
        Supa supaLegume = supaFactory.getSupa(TipSupe.Legume, "bors, legume", 200);
        supaLegume.preparareSupa();

        Supa supaVita = supaFactory.getSupa(TipSupe.Vita, "vita, legume", 100);
        supaVita.preparareSupa();

        Supa supaCiuperci = supaFactory.getSupa(TipSupe.Ciuperci, "ciuperci, legume", 200);
        supaCiuperci.preparareSupa();

    }
}