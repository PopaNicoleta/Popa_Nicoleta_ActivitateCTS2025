package D1_Simple_Factory.main;

import D1_Simple_Factory.clase.Credit;
import D1_Simple_Factory.factory.FactoryCredit;
import D1_Simple_Factory.factory.TipCredit;

public class Main {
    public static void main(String[] args) {

        FactoryCredit factory = new FactoryCredit();
        Credit creditNevoiPersonale = factory.createCredit(TipCredit.NevoiPersonale, "Marcel", 200000, 200, "20-04-2025");
        System.out.println(creditNevoiPersonale.toString());

        Credit creditIpotecar = factory.createCredit(TipCredit.Ipotecar, "Marilena", 4500000, 2600, "Str. Amurgului, Nr. 23");
        System.out.println(creditIpotecar.toString());
    }
}