package Prototype.main;

import Prototype.clase.AReteta;
import Prototype.clase.Reteta;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> solutiiSiCantitati = new HashMap<>();
        solutiiSiCantitati.put("solutiaA", 12.9);
        solutiiSiCantitati.put("solutiaB", 20.0);
        AReteta reteta = new Reteta(12, "Maria", solutiiSiCantitati);
        System.out.println(reteta);

        AReteta reteta1 = reteta.clone();
        System.out.println(reteta1);

        AReteta reteta2 = reteta.clone();
        System.out.println(reteta2);
    }
}