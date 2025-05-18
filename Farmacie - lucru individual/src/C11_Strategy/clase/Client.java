package C11_Strategy.clase;

public class Client implements ModPlata{
    private String nume;
    private ModPlata modPlata;

    public Client(String nume) {
        this.nume = nume;
        this.modPlata = new PlataCash(0);
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    @Override
    public void plateste(double suma) {
        this.modPlata.plateste(suma);
    }
}
