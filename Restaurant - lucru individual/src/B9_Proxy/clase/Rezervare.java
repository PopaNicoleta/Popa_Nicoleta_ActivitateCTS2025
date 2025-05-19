package B9_Proxy.clase;

public class Rezervare implements IRezervare {

    public Rezervare() {
    }

    @Override
    public void realizeazaRezervare(String nume, int nrPersoane) {
        System.out.println("A fost efectuata o rezervare pe numele " + nume + "!");
    }
}
