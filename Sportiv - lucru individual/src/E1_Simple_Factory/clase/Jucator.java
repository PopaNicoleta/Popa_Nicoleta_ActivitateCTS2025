package E1_Simple_Factory.clase;

public class Jucator {
    private String nume;
    private int varsta;
    private int numar;
    private int vechime;
    private String echipa;

    public Jucator(String nume, int varsta, int numar, int vechime, String echipa) {
        this.nume = nume;
        this.varsta = varsta;
        this.numar = numar;
        this.vechime = vechime;
        this.echipa = echipa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jucatorul ")
                .append(nume)
                .append(", in varsta de ")
                .append(varsta)
                .append(" de ani, ")
                .append("cu numarul ")
                .append(numar)
                .append(", joaca la echipa ")
                .append(echipa)
                .append(" de ").append(vechime)
                .append(" ani. ");
        return sb.toString();
    }
}
