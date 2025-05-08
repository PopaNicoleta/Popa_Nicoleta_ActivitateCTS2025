package Composite.main;

import Composite.clase.Departament;
import Composite.clase.IStructura;
import Composite.clase.Sectie;

public class Main {
    public static void main(String[] args) throws Exception {

        IStructura departament1 = new Departament("Chirurgie Generala");
        IStructura departament2 = new Departament("Interne");

        IStructura sectie1 = new Sectie("Cardiologie");
        IStructura sectie2 = new Sectie("Urgente");
        IStructura sectie3 = new Sectie("Pediatrie");

        departament1.adaugaStructura(sectie1);
        departament1.adaugaStructura(sectie2);
        departament1.adaugaStructura(sectie3);
        departament1.stergeStructura(sectie1);
        departament1.adaugaStructura(sectie1);

        departament2.adaugaStructura(sectie3);
        departament2.adaugaStructura(sectie2);

        departament1.descrieStructura();
        departament2.descrieStructura();

    }
}