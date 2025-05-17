package D7_Facade.main;

import D7_Facade.clase.Facade;
import D7_Facade.clase.Persoana;

public class Main {
    public static void main(String[] args) {
        Persoana persoana1 = new Persoana("Popa Marian", 56, true, false);
        Persoana persoana2 = new Persoana("Popa Ilie", 16, false, false);
        Persoana  persoana3 = new Persoana("Popa Mariana", 67, false, true);
        Persoana persoana4 = new Persoana("Popa Ilinca", 30, false, false);

        Facade facade = new Facade();
        facade.creazaCont(persoana1);

        System.out.println("");
        facade.creazaCont(persoana2);

        System.out.println("");
        facade.creazaCont(persoana3);

        System.out.println("");
        facade.creazaCont(persoana4);
    }
}
