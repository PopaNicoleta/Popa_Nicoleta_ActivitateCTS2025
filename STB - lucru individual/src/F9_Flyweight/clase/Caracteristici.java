package F9_Flyweight.clase;

public class Caracteristici {
    private String primaStatie;
    private String ultimaStatie;

    public Caracteristici(String primaStatie, String ultimaStatie) {
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(", prima statie: ").append(primaStatie);
        sb.append(", ultima statie: ").append(ultimaStatie).append(".");
        return sb.toString();
    }
}
