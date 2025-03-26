package Builder;

public class Main {
    public static void main(String[] args) {

        Pacient pacient = new Pacient();
        pacient.setNume("Marilena");
        pacient.setGen("feminin");
        pacient.setVarsta(21);
        pacient.setArePapuciDeCamera(true);
        pacient.setAreHalatPentruInterior(true);
        pacient.setArePatRabatabil(false);
        pacient.setAreMicDejunInclus(false);

        System.out.println(pacient.toString());

        Pacient pacient2 = new PacientBuilder().setNume("Costel").setGen("masculin").setVarsta(45).build();
        System.out.println(pacient2.toString());

    }
}