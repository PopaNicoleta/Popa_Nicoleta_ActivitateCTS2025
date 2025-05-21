package F7_Decorator.main;

import F7_Decorator.clase.Bilet;
import F7_Decorator.clase.BiletBasic;
import F7_Decorator.clase.BiletDecorat;
import F7_Decorator.clase.BiletZileNationale;

public class Main {
    public static void main(String[] args) {
        Bilet biletBasic = new BiletBasic(24);
        biletBasic.printeazaBilet();

        System.out.println("");
        BiletDecorat biletZiuaRomaniei = new BiletZileNationale(biletBasic, "La multi romani!");
        biletZiuaRomaniei.printeazaBilet();
    }
}
