package E5_Adapter.main;

import E5_Adapter.clase.AdapterBilet;
import E5_Adapter.clase.Bilet;
import E5_Adapter.clase.BiletOnline;

public class Main {
    public static void main(String[] args) {
        Bilet bilet1 = new Bilet(12, "Marinescu Theodora", 34);
        bilet1.rezervaBilet();
        bilet1.vindeBilet();

        BiletOnline biletOnline = new AdapterBilet(bilet1);
        biletOnline.vindeBilet();
        biletOnline.rezervaBilet();
    }
}
