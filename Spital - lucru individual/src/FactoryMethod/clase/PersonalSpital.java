package FactoryMethod.clase;

public abstract class PersonalSpital {
    private String nume;
    private int varsta;
    private double salariu;

    public PersonalSpital(String nume, int varsta, double salariu) {
        this.nume = nume;
        this.varsta = varsta;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public abstract void afiseazaDetalii();
}
