package B5_Adapter.clase;

public class SoftBucatarie implements IPlateste {
    private String preparat;
    private double pret;

    public SoftBucatarie(String preparat, double pret) {
        this.preparat = preparat;
        this.pret = pret;
    }

    public String getPreparat() {
        return preparat;
    }

    public void setPreparat(String preparat) {
        this.preparat = preparat;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }


    @Override
    public void plateste() {
        System.out.println("S-a efectuat o plata in valoare de " + this.pret + " de lei pentru preparatul " + this.preparat + ".");
    }
}
