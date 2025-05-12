package A14_Template.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital extends Template {
    private String nume;
    private int nrPaturiLibere;
    private List<Pacient> pacienti;

    public Spital(String nume, int nrPaturiLibere) {
        this.nume = nume;
        this.nrPaturiLibere = nrPaturiLibere;
        this.pacienti = new ArrayList<Pacient>();
    }

    public void setPacienti(List<Pacient> pacienti) {
        this.pacienti = pacienti;
    }

    @Override
    public boolean esteInStareGrava(Pacient pacient) {
        if (pacient.getStare() == StarePacient.Grava) {
            return true;
        }
        return false;
    }

    @Override
    public boolean verificaDisponibilitateSalon() {
        if (this.nrPaturiLibere == 0) {
            return false;
        }
        return true;
    }

    @Override
    public void emiteFisaInernare(Pacient pacient) {
        if (pacient.getStare() == StarePacient.Grava && this.nrPaturiLibere >= 1) {
            System.out.println("Am eliberta fisa de internare a pacientului " + pacient.getNume() + " in spitalul " + this.nume + ".");
            this.nrPaturiLibere--;
        } else {
            System.out.println("Nu s-a putut elibera fisa de internare!");
        }
    }
}
