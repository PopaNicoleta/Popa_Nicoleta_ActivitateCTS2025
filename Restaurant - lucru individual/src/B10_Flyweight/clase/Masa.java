package B10_Flyweight.clase;

public class Masa {
    private int numarMasa;
    private int numarPersoane;
    private String oraRezervare;

    public Masa(int numarMasa, int numarPersoane, String oraRezervare) {
        this.numarMasa = numarMasa;
        this.numarPersoane = numarPersoane;
        this.oraRezervare = oraRezervare;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }

    public String getOraRezervare() {
        return oraRezervare;
    }
}
