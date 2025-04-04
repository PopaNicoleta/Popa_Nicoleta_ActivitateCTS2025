package builderClase;

public class BicicletaBuilder implements IBicicleta {
    private String marca;
    private String culoare;
    private float pret;
    private boolean areDiametruRoti;
    private boolean areTipFrana;
    private boolean areCascaDeProtectie;
    private boolean areOchelari;

    public BicicletaBuilder() {
        this.marca = "SXMZ";
        this.culoare = "rosu";
        this.pret = 600;
        this.areDiametruRoti = false;
        this.areTipFrana = false;
        this.areCascaDeProtectie = false;
        this.areOchelari = false;
    }

    public BicicletaBuilder setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public BicicletaBuilder setCuloare(String culoare) {
        this.culoare = culoare;
        return this;
    }

    public BicicletaBuilder setPret(float pret) {
        this.pret = pret;
        return this;
    }

    public BicicletaBuilder setAreDiametruRoti(boolean areDiametruRoti) {
        this.areDiametruRoti = areDiametruRoti;
        return this;
    }

    public BicicletaBuilder setAreTipFrana(boolean areTipFrana) {
        this.areTipFrana = areTipFrana;
        return this;
    }

    public BicicletaBuilder setAreCascaDeProtectie(boolean areCascaDeProtectie) {
        this.areCascaDeProtectie = areCascaDeProtectie;
        return this;
    }

    public BicicletaBuilder setAreOchelari(boolean areOchelari) {
        this.areOchelari = areOchelari;
        return this;
    }


    @Override
    public Bicicleta build(String nume, String culoare, float pret) {
        return new Bicicleta(nume, culoare, pret, this.areDiametruRoti, this.areTipFrana, this.areCascaDeProtectie, this.areOchelari);
    }
}
