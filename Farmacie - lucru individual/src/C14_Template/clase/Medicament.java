package C14_Template.clase;

public class Medicament {
    private String nume;
    private int stoc;

    public Medicament(String nume, int stoc) {
        this.nume = nume;
        this.stoc = stoc;
    }

    public String getNume() {
        return nume;
    }

    public int getStoc() {
        return stoc;
    }
}
