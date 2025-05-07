package D9_Composite.clase;

public class Filiala implements Item{
    String nume;

    public Filiala(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("        " + this.nume);
    }
}
