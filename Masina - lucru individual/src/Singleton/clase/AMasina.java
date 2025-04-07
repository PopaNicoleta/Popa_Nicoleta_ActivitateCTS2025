package Singleton.clase;

public abstract class AMasina {
    private String marca;
    private String model;
    private String nrInmatriculare;
    private int anFabricatie;

    public AMasina(String marca, String model, String nrInmatriculare, int anFabricatie) {
        this.marca = marca;
        this.model = model;
        this.nrInmatriculare = nrInmatriculare;
        this.anFabricatie = anFabricatie;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(marca);
        sb.append(", model: ").append(model);
        sb.append(", numarul de inmatriculare: ").append(nrInmatriculare);
        sb.append(", fabricata in anul: ").append(anFabricatie).append(". ");
        return sb.toString();
    }
}
