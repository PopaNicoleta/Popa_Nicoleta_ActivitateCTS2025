package Factory_Method.clase;

public class MijlocTransport {
    private int nrLinie;
    private int nrLocuri;
    private int anFabricatie;

    public MijlocTransport(int nrLinie, int nrLocuri, int anFabricatie) {
        this.nrLinie = nrLinie;
        this.nrLocuri = nrLocuri;
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mijlocul de trasnport circula pe linia ")
                .append(nrLinie)
                .append(", are un numar de ")
                .append(nrLocuri)
                .append(" de locuri")
                .append(" si a fost fabricat in anul ")
                .append(anFabricatie)
                .append(".");
        return sb.toString();
    }
}
