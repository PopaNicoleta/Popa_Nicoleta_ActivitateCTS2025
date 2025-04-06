package Factory_Method.clase;

public class Troleibuz extends MijlocTransport {
    private double consumKW;

    public Troleibuz(int nrLinie, int nrLocuri, int anFabricatie, double consumKW) {
        super(nrLinie, nrLocuri, anFabricatie);
        this.consumKW = consumKW;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(" Tipul mijlocului de trasnport este troleibuz si consuma ")
                .append(consumKW)
                .append(" KW.");
        return sb.toString();
    }
}
