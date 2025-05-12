package A12_Observer.observer;

public class Pacient implements Observer {
    private String nume;
    private String prenume;

    public Pacient(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Pacientul " + this.nume + " " + this.prenume + " a fost instiintat ca " + mesaj );
    }
}
