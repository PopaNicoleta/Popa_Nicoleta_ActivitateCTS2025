package C9_Proxy.clase;

public class Client {
    private String nume;
    private String cnp;
    private boolean areReteta;

    public Client(String nume, String cnp, boolean areReteta) {
        this.nume = nume;
        this.cnp = cnp;
        this.areReteta = areReteta;
    }

    public String getNume() {
        return nume;
    }

    public String getCnp() {
        return cnp;
    }

    public boolean isAreReteta() {
        return areReteta;
    }
}
