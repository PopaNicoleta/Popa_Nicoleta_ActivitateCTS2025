package C3_Builder.clase;

public class Factura {
    private int nrFcatura;
    private String pacient;
    private int nrPungi;
    private boolean estePlataCuCardul;
    private boolean areCardFidelitate;
    private int cotaTva;

    public Factura(int nrFcatura, String pacient, int nrPungi, boolean estePlataCuCardul, boolean areCardFidelitate, int cotaTva) {
        this.nrFcatura = nrFcatura;
        this.pacient = pacient;
        this.nrPungi = nrPungi;
        this.estePlataCuCardul = estePlataCuCardul;
        this.areCardFidelitate = areCardFidelitate;
        this.cotaTva = cotaTva;
    }


    public void setNrFcatura(int nrFcatura) {
        this.nrFcatura = nrFcatura;
    }

    public void setPacient(String pacient) {
        this.pacient = pacient;
    }

    public void setNrPungi(int nrPungi) {
        this.nrPungi = nrPungi;
    }

    public void setEstePlataCuCardul(boolean estePlataCuCardul) {
        this.estePlataCuCardul = estePlataCuCardul;
    }

    public void setAreCardFidelitate(boolean areCardFidelitate) {
        this.areCardFidelitate = areCardFidelitate;
    }

    public void setCotaTva(int cotaTva) {
        this.cotaTva = cotaTva;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factura cu numarul: ")
                .append(nrFcatura).append(" apartine pacientului: ").append(pacient)
                .append(", care are urmatoarele optiuni extra:")
                .append(" nrPungi -> ").append(nrPungi)
                .append(", estePlataCuCardul -> ").append(estePlataCuCardul)
                .append(", areCardFidelitate -> ").append(areCardFidelitate)
                .append(", cotaTva ->").append(cotaTva)
                .append("%.");
        return sb.toString();
    }
}
