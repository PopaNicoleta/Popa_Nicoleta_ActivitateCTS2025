package E12_Observer.clase;

public class Client implements Observer {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(this.nume + ", ai primit urmatoarea notificare: " + mesaj);
    }

}
