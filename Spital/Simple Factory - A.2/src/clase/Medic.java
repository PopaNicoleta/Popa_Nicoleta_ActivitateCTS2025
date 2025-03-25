package clase;

public class Medic extends PersonalSpital{
    private String specializare;
    private int nrGarzi;
    private double valoareGarda;

    public Medic(String nume, int salariu, int varsta, int vechime, String specializare, int nrGarzi, double valoareGarda) {
        super(nume, salariu, varsta, vechime);
        this.specializare = specializare;
        this.nrGarzi = nrGarzi;
        this.valoareGarda = valoareGarda;
    }

    public String getSpecializare() {
        return specializare;
    }

    public int getNrGarzi() {
        return nrGarzi;
    }

    public double getValoareGarda() {
        return valoareGarda;
    }

    public void setValoareGarda(double valoareGarda) {
        this.valoareGarda = valoareGarda;
    }

    @Override
    public double calculeazaSalariuTotalCuSpor(double valoareSpor) {
        return super.calculeazaSalariuTotalCuSpor(valoareSpor) + getNrGarzi() * getValoareGarda();
    }

    @Override
    public void prezintaPersonal() {
        System.out.println("Medicul " + getNume() + " cu specializarea " + getSpecializare() + ", efectuează " + getNrGarzi() + " gărzi/lună.");
    }
}
