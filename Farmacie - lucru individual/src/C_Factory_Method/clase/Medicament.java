package C_Factory_Method.clase;

public class Medicament {

    private String denumire;
    private double pret;

    public Medicament(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicamentul ").append(denumire).
        append(" costa ").append(pret).append(" lei");
        return sb.toString();
    }
}
