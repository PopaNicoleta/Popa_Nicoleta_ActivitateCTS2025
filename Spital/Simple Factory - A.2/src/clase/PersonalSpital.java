package clase;

public abstract class PersonalSpital {
    private String nume;
    private int salariu;
    private int varsta;
    private int vechime;

    public PersonalSpital(String nume, int salariu, int varsta, int vechime) {
        this.nume = nume;
        this.salariu = salariu;
        this.varsta = varsta;
        this.vechime = vechime;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    public double calculeazaSalariuTotalCuSpor(double valoareSpor){
        return getSalariu() + valoareSpor * getVechime();
    }

    public abstract void prezintaPersonal();
}
