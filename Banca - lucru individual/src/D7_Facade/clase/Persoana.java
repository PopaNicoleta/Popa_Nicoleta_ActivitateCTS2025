package D7_Facade.clase;

public class Persoana {
    private String nume;
    private int varsta;
    private boolean esteUrmaritDePolitie;
    private boolean areCreanteLaAlteBanci;

    public Persoana(String nume, int varsta, boolean esteUrmaritDePolitie, boolean areCreanteLaAlteBanci) {
        this.nume = nume;
        this.varsta = varsta;
        this.esteUrmaritDePolitie = esteUrmaritDePolitie;
        this.areCreanteLaAlteBanci = areCreanteLaAlteBanci;
    }

    public boolean esteUrmaritDePolitie() {
        return esteUrmaritDePolitie;
    }

    public boolean areCreanteLaAlteBanci() {
        return areCreanteLaAlteBanci;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }
}
