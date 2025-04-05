package C4_Prototype.main;

import C4_Prototype.clase.AReteta;
import C4_Prototype.clase.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> compozitieMedicament = new HashMap<String, Double>();
        compozitieMedicament.put("acid acetic", 19.0);
        compozitieMedicament.put("acid salicilic", 10.0);
        AReteta reteta = new Reteta(123, compozitieMedicament);
        System.out.println(reteta.toString());

        AReteta reteta2 = reteta.clone();
        System.out.println(reteta2.toString());

        AReteta reteta3 = reteta2.clone();
        System.out.println(reteta3.toString());
    }
}