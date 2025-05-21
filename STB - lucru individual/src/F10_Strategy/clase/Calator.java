package F10_Strategy.clase;

public class Calator {
    private String nume;
    private Plata modPlata;

    public Calator(String nume) {
        this.nume = nume;
        this.modPlata = new PlataSMS();
    }

    public void setModPlata(Plata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(double suma) {
        this.modPlata.plateste(suma);
    }
}
