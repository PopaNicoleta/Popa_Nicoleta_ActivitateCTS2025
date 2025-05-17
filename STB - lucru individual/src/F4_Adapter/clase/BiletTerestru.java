package F4_Adapter.clase;

public class BiletTerestru implements Bilet {
    private double pret;
    private String termenValabilitate;

    public BiletTerestru(double pret, String termenValabilitate) {
        this.pret = pret;
        this.termenValabilitate = termenValabilitate;
    }

    public double getPret() {
        return pret;
    }

    public String getTermenValabilitate() {
        return termenValabilitate;
    }

    @Override
    public void cumparaBilet() {
        System.out.println("A fost achizitionat un bilet pentru trasportul terestru in valoare de " + this.pret + " de lei. Acesta este valid pana pe data de " + this.termenValabilitate);
    }

}
