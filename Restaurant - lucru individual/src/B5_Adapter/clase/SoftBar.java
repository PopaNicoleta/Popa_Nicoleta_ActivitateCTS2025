package B5_Adapter.clase;

public class SoftBar implements IPlateste
{
    private String bautura;
    private double pret;

    public SoftBar(String bautura, double pret) {
        this.bautura = bautura;
        this.pret = pret;
    }

    public String getBautura() {
        return bautura;
    }

    public void setBautura(String bautura) {
        this.bautura = bautura;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public void plateste() {
        System.out.println("S-a efectuat o plata in valoare de " + this.pret + " de lei pentru bautura " + this.bautura + ".");

    }
}
