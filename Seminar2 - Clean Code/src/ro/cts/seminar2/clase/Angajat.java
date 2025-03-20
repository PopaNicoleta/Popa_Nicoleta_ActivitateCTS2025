package ro.cts.seminar2.clase;

import ro.cts.seminar2.finantari.ConstanteFinantare;

import static ro.cts.seminar2.finantari.ConstanteFinantare.SUMA_FINANTARE_ANGAJAT;

public class Angajat extends Aplicant{
    private String ocupatie;
    private int salariu;
    public Angajat() {
        super();
    }
    public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte, int salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiecte, SUMA_FINANTARE_ANGAJAT);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    public String getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Angajat: " + super.toString() + ", Ocupatie=" + ocupatie + ", Salariu=" + salariu;
    }

}
