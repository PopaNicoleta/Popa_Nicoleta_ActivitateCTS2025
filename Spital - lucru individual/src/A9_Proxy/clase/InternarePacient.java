package A9_Proxy.clase;

public class InternarePacient implements Internare {
    private Pacient pacient;

    public InternarePacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public Pacient getPacient() {
        return pacient;
    }

    @Override
    public void interneaza() {
        System.out.println("Am internat pacientul cu numele " + this.pacient.getNume() + "!");

    }
}
