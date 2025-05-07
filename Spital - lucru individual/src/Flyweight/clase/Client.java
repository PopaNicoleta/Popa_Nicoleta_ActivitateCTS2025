package Flyweight.clase;

public class Client {
    private String nume;
    private String nrTelefon;
    private String adresaEmail;

    public Client(String nume, String nrTelefon, String adresaEmail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresaEmail = adresaEmail;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(", clientul->  ");
        sb.append("nume: ").append(nume);
        sb.append(", numar de telefon: ").append(nrTelefon);
        sb.append(", adresa de e-mail: ").append(adresaEmail);

        return sb.toString();
    }
}
