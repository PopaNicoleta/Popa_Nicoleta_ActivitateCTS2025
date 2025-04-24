package Proxy.clase;

public class Rezervare implements IRezervare {

    public Rezervare() {

    }

    @Override
    public void realizeazaRezervare(String numeClient, int nrPersoane) {
        System.out.println("Rezervarea a fost realizata pe numele " + numeClient + ", pentru "  + nrPersoane + " persoane.");
    }
}
