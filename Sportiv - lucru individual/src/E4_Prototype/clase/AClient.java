package E4_Prototype.clase;

import java.util.Map;

public abstract class AClient {
    protected String nume;
    protected String prenume;
    protected String cnp;
    protected int varsta;
    protected Map<Integer, String> rezervariAnterioare;
    public AClient(String nume, String prenume, String cnp, int varsta, Map<Integer, String> rezervariAnterioare) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.varsta = varsta;
        this.rezervariAnterioare = rezervariAnterioare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AClient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", cnp='").append(cnp).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", rezervariAnterioare=").append(rezervariAnterioare);
        sb.append('}');
        return sb.toString();
    }

    public abstract AClient clone();
}
