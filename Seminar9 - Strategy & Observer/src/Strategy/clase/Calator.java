package Strategy.clase;

public class Calator {
    private String nume;
    private Plata modalitatePlata;

    public Calator(String nume) {
        this.nume = nume;
        this.modalitatePlata = new PlataCardBancar(0);
    }

    public void setModalitatePlata(Plata modalitatePlata) {
        this.modalitatePlata = modalitatePlata;
    }

    public void platesteBilet(double pret){
        this.modalitatePlata.plateste(pret);
    }
}
