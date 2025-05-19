package B11_Strategy.clase;

public class Client {
    private String nume;
    private Plata modalitatePlata;

    public Client(String nume) {
        this.nume = nume;
        this.modalitatePlata = new PlataCard();
    }

    public void setModalitatePlata(Plata modalitatePlata) {
        this.modalitatePlata = modalitatePlata;
    }

    public void plateste(double suma) {
        this.modalitatePlata.realizeazaPlata(suma);
    }
}
