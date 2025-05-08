package Flyweight.main;

import Flyweight.clase.Pacient;
import Flyweight.clase.Receptie;
import Flyweight.clase.Spitalizare;

public class Main {
    public static void main(String[] args){

        Receptie receptie = new Receptie();

        Spitalizare spitalizare1 = new Spitalizare(2, 3, 5);
        Spitalizare spitalizare2 = new Spitalizare(4, 6, 7);
        Spitalizare spitalizare3 = new Spitalizare(8, 9, 10);

        receptie.getPacienti("maria", "3242323232", "str. amurgului").afisareInformatii(spitalizare1);
        receptie.getPacienti("ionel", "43545356564", "str.lalelelor").afisareInformatii(spitalizare2);
        receptie.getPacienti("lavinia", "543243543", "str. caporal preda").afisareInformatii(spitalizare3);

        try{
            receptie.getPacientiV2("ionel").afisareInformatii(spitalizare1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}