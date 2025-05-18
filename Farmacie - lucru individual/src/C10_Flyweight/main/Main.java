package C10_Flyweight.main;

import C10_Flyweight.clase.Achizitie;
import C10_Flyweight.clase.Reteta;

public class Main {
    public static void main(String[] args) {

        Reteta reteta1 = new Reteta(12, 230, 4);
        Reteta reteta2 = new Reteta(32, 20, 1);
        Reteta reteta3 = new Reteta(1, 730, 12);

        Achizitie achizitie1 = new Achizitie();
        achizitie1.getClient("Costel", 323, 45).afiseazaDetaliiAchizitii(reteta1);
        achizitie1.getClient("Costel", 323, 45).afiseazaDetaliiAchizitii(reteta2);

    }
}
