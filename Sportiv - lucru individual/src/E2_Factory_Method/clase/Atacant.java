package E2_Factory_Method.clase;

public class Atacant extends Jucator {
    private int nrGoluriDate;

    public Atacant(String nume, int varsta, int numar, int vechime, String echipa, int nrGoluriDate) {
        super(nume, varsta, numar, vechime, echipa);
        this.nrGoluriDate = nrGoluriDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("Pozitia pe care joaca este cea de atacant si, pana in prezent, a dat ")
                .append(nrGoluriDate)
                .append(" goluri.");
        return sb.toString();
    }
}
