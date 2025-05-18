package C10_Flyweight.clase;

public class Reteta {
    private int numarReteta;
    private double sumaDePlata;
    private int numarMedicamente;

    public Reteta(int numarReteta, double sumaDePlata, int numarMedicamente) {
        this.numarReteta = numarReteta;
        this.sumaDePlata = sumaDePlata;
        this.numarMedicamente = numarMedicamente;
    }

    public int getNumarReteta() {
        return numarReteta;
    }

    public double getSumaDePlata() {
        return sumaDePlata;
    }

    public int getNumarMedicamente() {
        return numarMedicamente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("numar reteta: ").append(numarReteta);
        sb.append(", suma de plata: ").append(sumaDePlata);
        sb.append(", numarul de medicamente: ").append(numarMedicamente);
        sb.append('.');
        return sb.toString();
    }
}
