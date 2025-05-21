package E14_Template.main;

import E14_Template.clase.Persoana;

public class Main {
    public static void main(String[] args) {
        Persoana persoana1 = new Persoana("Marius", false);
        Persoana persoana2 = new Persoana("Andrei", true);

        persoana1.intraSiOcupa(12);
        System.out.println("");
        persoana2.intraSiOcupa(12);

        System.out.println("");
        persoana2.intraSiOcupa(13);
    }
}
