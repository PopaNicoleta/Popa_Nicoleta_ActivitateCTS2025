package C1_Simple_Factory.clase;

public class Medicament {
    private String denumire;
    private float pret;
    private int cantitate;

    public Medicament(String denumire, float pret, int cantitate) {
        this.denumire = denumire;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament ");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", cantitate=").append(cantitate);
        return sb.toString();
    }
}
