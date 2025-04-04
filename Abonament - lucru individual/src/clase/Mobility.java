package clase;

public class Mobility implements Subscription{
    private String numeClient;
    private String dataNastere;
    private int varsta;
    private float reducereFidelitate;

    public Mobility(String numeClient, String dataNastere, int varsta, float reducereFidelitate) {
        this.numeClient = numeClient;
        this.dataNastere = dataNastere;
        this.varsta = varsta;
        this.reducereFidelitate = reducereFidelitate;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setDataNastere(String dataNastere) {
        this.dataNastere = dataNastere;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setReducereFidelitate(float reducereFidelitate) {
        this.reducereFidelitate = reducereFidelitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Nume client='").append(numeClient).append('\'');
        sb.append(", dataNastere='").append(dataNastere).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", reducereFidelitate=").append(reducereFidelitate);
        return sb.toString();
    }

    @Override
    public float totalCost(int durationInMonths){
        return this.reducereFidelitate * durationInMonths;
    }
}
