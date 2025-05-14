package B16_Chain_Of_Responsability.clase;

public class Client {
    private String nume;
    private String nrTelefon;
    private String mail;

    public Client(String nume, String nrTelefon, String mail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.mail = mail;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
