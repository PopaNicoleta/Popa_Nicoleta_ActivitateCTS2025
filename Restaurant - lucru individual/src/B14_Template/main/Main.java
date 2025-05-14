package B14_Template.main;

import B14_Template.clase.Masa;
import B14_Template.clase.Rezervare;
import B14_Template.clase.Template;

public class Main {
    public static void main(String[] args) {
        Template masa = new Masa(12, 5);
        Rezervare rezervare1 = new Rezervare("Marian", 6);
        masa.ocupaMasa(rezervare1);

        Rezervare rezervare2 = new Rezervare("Crina", 3);
        masa.ocupaMasa(rezervare2);
    }
}
