package Observer.clase;

public class Calator implements Observator{

    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println("Calatorul " + this.nume + "a primit o notificare: " + mesaj);
    }
}
