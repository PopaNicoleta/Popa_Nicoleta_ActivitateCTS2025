package F9_Flyweight.clase;

public class AutobuzLinie implements Flyweight {
    private String model;
    private int anFabricatie;
    private int nrLocuri;
    private int nrLinie;

    public AutobuzLinie(String model, int anFabricatie, int nrLocuri, int nrLinie) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
        this.nrLinie = nrLinie;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    public void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Date autobuz -> ");
        sb.append("model: ").append(model);
        sb.append(", an fabricatie: ").append(anFabricatie);
        sb.append(", numar locuri: ").append(nrLocuri);
        sb.append(", nmumar linie: ").append(nrLinie);
        return sb.toString();
    }

    @Override
    public void salveaza(Caracteristici caracteristici) {
        System.out.println(this.toString() + caracteristici.toString());
    }
}
