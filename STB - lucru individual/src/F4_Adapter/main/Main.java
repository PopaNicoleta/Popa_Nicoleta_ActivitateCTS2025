package F4_Adapter.main;

import F4_Adapter.clase.AdapterBilet;
import F4_Adapter.clase.Bilet;
import F4_Adapter.clase.BiletMetrou;
import F4_Adapter.clase.BiletTerestru;

public class Main {
    public static void main(String[] args){
        Bilet biletTerestru = new BiletTerestru(3, "20-05-20225");
        biletTerestru.cumparaBilet();

        Bilet biletMetrou = new BiletMetrou(5, "23-05-20225");
        biletMetrou.cumparaBilet();

        Bilet biletAdapter = new AdapterBilet((BiletTerestru) biletTerestru);
        biletAdapter.cumparaBilet();

    }
}
