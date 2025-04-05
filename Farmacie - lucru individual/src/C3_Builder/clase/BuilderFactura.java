package C3_Builder.clase;

public class BuilderFactura implements IBuilder {

    private int nrPungi;
    private boolean estePlataCuCardul;
    private boolean areCardFidelitate;
    private int cotaTva;

    public BuilderFactura() {
        this.nrPungi = 0;
        this.estePlataCuCardul = false;
        this.areCardFidelitate = false;
        this.cotaTva = 0;
    }

    public BuilderFactura setNrPungi(int nrPungi) {
        this.nrPungi = nrPungi;
        return this;
    }

    public BuilderFactura setEstePlataCuCardul(boolean estePlataCuCardul) {
        this.estePlataCuCardul = estePlataCuCardul;
        return this;
    }

    public BuilderFactura setAreCardFidelitate(boolean areCardFidelitate) {
        this.areCardFidelitate = areCardFidelitate;
        return this;
    }

    public BuilderFactura setCotaTva(int cotaTva) {
        this.cotaTva = cotaTva;
        return this;
    }

    @Override
    public Factura build(int nrFactura, String pacient) {
        return new Factura(nrFactura, pacient, this.nrPungi, this.estePlataCuCardul, this.areCardFidelitate, this.cotaTva);
    }
}
