package Factory_Method.clase;

public class Tramvai extends MijlocTransport {
    private double kmParcursiPeZi;

    public Tramvai(int nrLinie, int nrLocuri, int anFabricatie, double  kmParcursiPeZi) {
        super(nrLinie, nrLocuri, anFabricatie);
        this.kmParcursiPeZi = kmParcursiPeZi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(" Tipul mijlocului de trasnport este tramvai si parcurge ")
                .append(kmParcursiPeZi)
                .append(" de km pe zi.");
        return sb.toString();
    }
}
