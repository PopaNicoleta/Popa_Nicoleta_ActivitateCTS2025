package A14_Template.clase;

public abstract class Template {

    public final void interneaza(Pacient pacient) {
        if (esteInStareGrava(pacient)) {
            if (verificaDisponibilitateSalon()) {
                emiteFisaInernare(pacient);
            } else {
                System.out.println("Nu exista paturi disponibile");
            }
        } else {
            System.out.println("Pacientul " + pacient.getNume() + " nu trebuie internat.");
        }
    }


    public abstract boolean esteInStareGrava(Pacient pacient);

    public abstract boolean verificaDisponibilitateSalon();

    public abstract void emiteFisaInernare(Pacient pacient);

}
