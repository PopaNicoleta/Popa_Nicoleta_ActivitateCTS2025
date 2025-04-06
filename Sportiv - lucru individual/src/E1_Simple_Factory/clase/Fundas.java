package E1_Simple_Factory.clase;

public class Fundas extends Jucator{
    private int nrCartonaseGalbenePrimite;

    public Fundas(String nume, int varsta, int numar, int vechime, String echipa, int nrCartonaseGalbenePrimite) {
        super(nume, varsta, numar, vechime, echipa);
        this.nrCartonaseGalbenePrimite = nrCartonaseGalbenePrimite;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("Pozitia pe care joaca este cea de fundas si, pana in prezent, a primit ")
                .append(nrCartonaseGalbenePrimite)
                .append(" cartonase galbene.");
        return sb.toString();
    }
}
