package E7_Decorator.main;

import E5_Adapter.clase.Bilet;
import E7_Decorator.clase.BiletMesaj;
import E7_Decorator.clase.BiletNormal;

public class Main {
    public static void main(String[] args) {

        BiletNormal biletNormal = new BiletNormal(200);
        biletNormal.printeaza();

        System.out.println("");
        BiletMesaj biletMesaj = new BiletMesaj(biletNormal, "FCSB Bucuresti");
        biletMesaj.printeaza();
    }
}
