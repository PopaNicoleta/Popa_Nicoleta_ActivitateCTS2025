package F2_Prototype.main;

import F2_Prototype.clase.AbstractAutobuz;
import F2_Prototype.clase.Autobuz;

public class Main {
    public static void main(String[] args) {
        AbstractAutobuz autobuz = new Autobuz("Mercedes-Benz", 2013, 6.0, "motorina");
        System.out.println(autobuz.toString());

        AbstractAutobuz copie1 =  autobuz.clone();
        System.out.println(copie1.toString());

        AbstractAutobuz copie2 =  autobuz.clone();
        System.out.println(copie2.toString());
    }
}