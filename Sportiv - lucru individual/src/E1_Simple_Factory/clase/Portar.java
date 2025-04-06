package E1_Simple_Factory.clase;

public class Portar extends Jucator{
    private int nrGoluriAparate;

    public Portar(String nume, int varsta, int numar, int vechime, String echipa, int nrGoluriAparate) {
        super(nume, varsta, numar, vechime, echipa);
        this.nrGoluriAparate = nrGoluriAparate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("Pozitia pe care joaca este cea de protar si, pana in prezent, a aparat ")
                .append(nrGoluriAparate)
                .append(" de goluri.");
        return sb.toString();
    }
}
