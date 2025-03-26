package SimpleFactory.clase;

public class Brancardier extends PersonalSpital{
    private String tura;
    private int nrTureDeNoapte;
    private double valoareTuraDeNoapte;

    public Brancardier(String nume, int salariu, int varsta, int vechime, String tura, int nrTureDeNoapte, double valoareTuraDeNoapte) {
        super(nume, salariu, varsta, vechime);
        this.tura = tura;
        this.nrTureDeNoapte = nrTureDeNoapte;
        this.valoareTuraDeNoapte = valoareTuraDeNoapte;
    }

    public String getTura() {
        return tura;
    }

    public int getNrTureDeNoapte() {
        return nrTureDeNoapte;
    }

    public void setNrTureDeNoapte(int nrTureDeNoapte) {
        this.nrTureDeNoapte = nrTureDeNoapte;
    }

    public double getValoareTuraDeNoapte() {
        return valoareTuraDeNoapte;
    }

    public void setValoareTuraDeNoapte(double valoareTuraDeNoapte) {
        this.valoareTuraDeNoapte = valoareTuraDeNoapte;
    }

    @Override
    public void prezintaPersonal() {
        System.out.println("Brancardierul " + getNume() + " lucrează în tura de " + tura + " și efectuează " + nrTureDeNoapte + " ture de noapte/lună. ");
    }

    @Override
    public double calculeazaSalariuTotalCuSpor(double valoareSpor) {
        return super.calculeazaSalariuTotalCuSpor(valoareSpor) + getNrTureDeNoapte() * getValoareTuraDeNoapte();
    }
}
