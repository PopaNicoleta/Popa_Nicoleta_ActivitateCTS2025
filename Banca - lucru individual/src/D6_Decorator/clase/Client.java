package D6_Decorator.clase;

public class Client {
    private String nume;
    private String cnp;
    private int varsta;
    private double sold;

    public Client(String nume, String cnp, int varsta, double sold) {
        this.nume = nume;
        this.cnp = cnp;
        this.varsta = varsta;
        this.sold = sold;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }
}
