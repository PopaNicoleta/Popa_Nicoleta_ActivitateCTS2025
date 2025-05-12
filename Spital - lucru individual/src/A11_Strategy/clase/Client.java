package A11_Strategy.clase;

public class Client {
    private String nume;
    private String prenume;
    private Plata plata;

    public Client(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public void alegeModalitateaDePlata(Plata plata) {
        this.plata = plata;
    }

    public void plateste(double sumaDePlata) {
        this.plata.efectueazaPlata(this.nume, this.prenume, sumaDePlata);
    }
}
