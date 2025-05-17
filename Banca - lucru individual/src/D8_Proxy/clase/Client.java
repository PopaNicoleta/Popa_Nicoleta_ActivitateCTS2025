package D8_Proxy.clase;

public class Client {
    private String nume;
    private String cnp;
    private int varsta;

    public Client(String nume, String cnp, int varsta) {
        this.nume = nume;
        this.cnp = cnp;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getCnp() {
        return cnp;
    }

    public int getVarsta() {
        return varsta;
    }
}
