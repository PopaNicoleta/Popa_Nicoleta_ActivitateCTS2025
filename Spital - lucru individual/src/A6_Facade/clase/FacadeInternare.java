package A6_Facade.clase;

public class FacadeInternare {
    private Medic medic;
    private Salon salon;

    public FacadeInternare(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient, int nrPat) {
        if (this.medic.verificaStareGrava(pacient)) {
            System.out.println("Pacientul " + pacient.getNume() + " trebuie internat");
            if (salon.verificaDisponibilitatePat(nrPat)) {
                System.out.println("Patul cu numarul " + nrPat + " este liber!");
                System.out.println("Pacientul poate fi internat!");
            } else {
                System.out.println("Patul cu numarul " + nrPat + "este ocupat!");
            }
        } else {
            System.out.println("Pacientul " + pacient.getNume() + " nu trebuie internat");
        }
    }
}
