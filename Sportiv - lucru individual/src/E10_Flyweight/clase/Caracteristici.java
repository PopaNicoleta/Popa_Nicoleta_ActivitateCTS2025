package E10_Flyweight.clase;

public class Caracteristici {
    private double inaltime;
    private double latime;

    public Caracteristici(double inaltime, double latime) {
        this.inaltime = inaltime;
        this.latime = latime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(", inaltime: ").append(inaltime);
        sb.append(", latime: ").append(latime);
        sb.append('.');
        return sb.toString();
    }
}
