package clase;

public class Rezervare extends ARezervare{

    public Rezervare() {
    }

    public Rezervare(String numeClient, int nrPersoane, String data, String ora) {
        super(numeClient, nrPersoane, data, ora);
    }

    @Override
    public void descriere() {
        System.out.println("Aceasta este o rezervare!");
    }

    @Override
    public ARezervare clone() {
        Rezervare rezervare = new Rezervare();
        rezervare.numeClient = this.numeClient;
        rezervare.nrPersoane = this.nrPersoane;
        rezervare.data = this.data;
        rezervare.ora = this.ora;
        return rezervare;
    }
}
