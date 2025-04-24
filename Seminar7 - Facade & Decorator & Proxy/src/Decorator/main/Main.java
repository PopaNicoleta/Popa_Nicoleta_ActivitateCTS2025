package Decorator.main;

import Decorator.clase.*;

public class Main {
    public static void main(String[] args) {

        Nota nota = new NotaPlata(200);
        Nota notaDecorata = new NotaSfarsitAn(nota);
        //notaDecorata.printeaza();

        Nota notaCraciun = new NotaCraciun(notaDecorata);
        Nota notaPaste = new NotaPaste(notaCraciun);
        notaPaste.printeaza();

    }
}