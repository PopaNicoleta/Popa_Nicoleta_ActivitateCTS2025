package A6_Facade.clase;

public class Pacient {
    private String nume;
    private int varsta;
    private String stare;

    public Pacient(String nume, int varsta, String stare) {
        this.nume = nume;
        this.varsta = varsta;
        this.stare = stare;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getStare() {
        return stare;
    }
}
