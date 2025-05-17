package E5_Adapter.clase;

public class Bilet implements OperatiiBilete{
    private int numarBilet;
    private String numeCumparator;
    private double pret;

    public Bilet(int numarBilet, String numeCumparator, double pret) {
        this.numarBilet = numarBilet;
        this.numeCumparator = numeCumparator;
        this.pret = pret;
    }

    public int getNumarBilet() {
        return numarBilet;
    }

    public String getNumeCumparator() {
        return numeCumparator;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public void rezervaBilet(){
        System.out.println(this.numeCumparator + " a rezervat biletul cu numarul " + this.numarBilet);
    }

    @Override
    public void vindeBilet() {
        System.out.println(this.numeCumparator + " a cumparat un biletul cu numarul " + this.numarBilet + " in valoare de " + this.pret + " de lei.");

    }
}
