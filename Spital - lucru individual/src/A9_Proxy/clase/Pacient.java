package A9_Proxy.clase;

public class Pacient {
    private String nume;
    private int varsta;
    private boolean areAsigurareDeSanatate;

    public Pacient(String nume, int varsta, boolean areAsigurareDeSanatate) {
        this.nume = nume;
        this.varsta = varsta;
        this.areAsigurareDeSanatate = areAsigurareDeSanatate;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public boolean isAreAsigurareDeSanatate() {
        return areAsigurareDeSanatate;
    }
}
