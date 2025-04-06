package E3_Builder.main;


import E3_Builder.clase.BuilderRezervare;
import E3_Builder.clase.IBuilder;
import E3_Builder.clase.Rezervare;

public class Main {
    public static void main(String[] args) {

        BuilderRezervare builder = new BuilderRezervare();

        Rezervare rezervare_1 = builder.build("Anton", 213, "07-04-2025");
        System.out.println(rezervare_1.toString());

        Rezervare rezervaare_2 = builder.setAreMuzicaAmbientala(true).setGenMuzica("rock").build("Elena", 453, "03-06-2025");
        System.out.println(rezervaare_2.toString());
    }
}