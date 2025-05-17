package F4_Adapter.clase;

public class BiletMetrou implements Bilet {
    private double pret;
    private String termenValabilitate;

    public BiletMetrou(double pret, String termenValabilitate) {
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
        System.out.println("A fost achizitionat un bilet pentru metrou in valoare de " + this.pret + " de lei. Acesta este valid pana pe data de " + this.termenValabilitate);
    }
}
