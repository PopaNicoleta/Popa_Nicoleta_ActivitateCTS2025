package C12_Observer.clase;

public class Client implements Observer {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(this.nume + ", ai primit urmatoarea notificare: " + mesaj);
    }
}
