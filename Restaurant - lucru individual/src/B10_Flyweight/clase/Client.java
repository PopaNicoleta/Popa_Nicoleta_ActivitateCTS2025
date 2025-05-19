package B10_Flyweight.clase;

public class Client implements Rezervare {
    private String nume;
    private String numarTelefon;
    private String adresaMail;

    public Client(String nume, String numarTelefon, String adresaMail) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresaMail = adresaMail;
    }

    public String getNume() {
        return nume;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public String getAdresaMail() {
        return adresaMail;
    }
    @Override
    public void afiseazaDetalii(Masa masa) {
        System.out.println("Clientul cu numele " + this.nume + " a facut o rezervare la masa " + masa.getNumarMasa() + ", pentru un numar de " + masa.getNumarMasa() + ", la ora " + masa.getOraRezervare() + ".");
    }
}
