package E8_Proxy.main;

import E8_Proxy.clase.IVanzare;
import E8_Proxy.clase.Persoana;
import E8_Proxy.clase.VanzareBilet;
import E8_Proxy.clase.VanzareBiletProxy;

public class Main {
    public static void main(String[] args) {
        Persoana persoana1 = new Persoana("Andrei", 14);
        Persoana persoana2 = new Persoana("Matei", 13);

        IVanzare vanzare1 = new VanzareBilet();
        vanzare1.vindeBilet(persoana2);

        System.out.println("");
        IVanzare vanzare2 = new VanzareBilet();
        vanzare2.vindeBilet(persoana1);

        System.out.println("");
        IVanzare vanzareProxy1 = new VanzareBiletProxy(vanzare1);
        vanzareProxy1.vindeBilet(persoana2);

        System.out.println("");
        IVanzare vanzareProxy2 = new VanzareBiletProxy(vanzare2);
        vanzareProxy2.vindeBilet(persoana1);
    }
}
