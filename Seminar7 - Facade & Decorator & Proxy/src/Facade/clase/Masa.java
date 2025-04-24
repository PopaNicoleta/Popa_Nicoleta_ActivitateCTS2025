package Facade.clase;

public class Masa {
    private int nrMasa;
    private boolean esteLibera;

    public Masa(int nrMasa, boolean esteLibera) {
        this.nrMasa = nrMasa;
        this.esteLibera = esteLibera;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa ");
        sb.append("cu numarul: ").append(nrMasa);
        sb.append(", esteLibera? -> ").append(esteLibera);
        return sb.toString();
    }
}
