package C7_Decorator.main;

import C7_Decorator.clase.Bon;
import C7_Decorator.clase.BonDeCasa;
import C7_Decorator.clase.BonDecorat;
import C7_Decorator.clase.BonFelicitare;

public class Main {
    public static void main(String[] args) {

        Bon bon1 = new BonDeCasa();
        bon1.printeazaBon();

        System.out.println("");
        Bon bon2 = new BonFelicitare(bon1);
        bon2.printeazaBon();
    }
}
