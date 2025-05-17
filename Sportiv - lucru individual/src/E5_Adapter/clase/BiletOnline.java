package E5_Adapter.clase;

public class BiletOnline implements OperatiiBilete {
    private String numeCumparator;
    private double pret;

    public BiletOnline(String numeCumparator, double pret) {
        this.numeCumparator = numeCumparator;
        this.pret = pret;
    }

    public String getNumeCumparator() {
        return numeCumparator;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public void rezervaBilet() {
        System.out.println("Momentan nu se pot rezerva bilete online!");
    }

    @Override
    public void vindeBilet() {
        System.out.println(this.numeCumparator + " a cumparat prin intermediul platformei eBilet.ro un bilet in valoare de " + this.pret + " de lei.");
    }
}
