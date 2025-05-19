package A9_Proxy.clase;

public class InternareProxy implements Internare {
    private InternarePacient internarePacient;

    public InternareProxy(InternarePacient internarePacient) {
        this.internarePacient = internarePacient;
    }

    public InternareProxy(Pacient pacient) {
        this.internarePacient = new InternarePacient(pacient);
    }

    @Override
    public void interneaza() {
        if(internarePacient.getPacient().isAreAsigurareDeSanatate()) {
            System.out.println("Am internat pacientul cu numele " + internarePacient.getPacient().getNume() + "!");
        } else{
            System.out.println("Pacientul cu numele " + internarePacient.getPacient().getNume() + " nu poate fi internat deoarece nu are asigurare de sanatate!");
        }
    }
}
