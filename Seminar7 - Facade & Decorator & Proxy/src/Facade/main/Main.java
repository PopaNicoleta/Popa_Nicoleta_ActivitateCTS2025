package Facade.main;

import Facade.clase.Facade;
import Facade.clase.Masa;
import Facade.clase.Ospatar;
import Facade.clase.Picolo;

public class Main {
    public static void main(String[] args) {

        Facade facade = new Facade();

        Masa masa = new Masa(4, true);
        System.out.println(facade.verificaAsezareMasa(masa));

        Masa masa2 = new Masa(8, false);
        System.out.println(facade.verificaAsezareMasa(masa2));

        Masa masa3 = new Masa(3, true);
        System.out.println(facade.verificaAsezareMasa(masa3));



    }
}