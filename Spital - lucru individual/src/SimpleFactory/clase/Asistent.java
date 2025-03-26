package SimpleFactory.clase;

public class Asistent extends PersonalSpital {
    private String sectie;
    private double bonus;

    public String getSectie() {
        return sectie;
    }

    public void setSectie(String sectie) {
        this.sectie = sectie;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Asistent(String nume, int salariu, int varsta, int vechime, String sectie, double bonus) {
        super(nume, salariu, varsta, vechime);
        this.sectie = sectie;
        this.bonus = bonus;
    }

    @Override
    public double calculeazaSalariuTotalCuSpor(double valoareSpor) {
        return getSalariu() + valoareSpor * getVechime() + getBonus();
    }

    @Override
    public void prezintaPersonal() {
        System.out.println("Asistentul " + getNume() + " lucreaza pe sectia " + getSectie() + ", cu o vechime de " + getVechime() + " ani.");
    }

}
