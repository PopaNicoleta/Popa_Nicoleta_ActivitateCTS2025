package builderClase;

public class Bicicleta {
    private final String marca;
    private final String culoare;
    private final float pret;
    private final boolean areDiametruRoti;
    private final boolean areTipFrana;
    private final boolean areCascaDeProtectie;
    private final boolean areOchelari;

    public Bicicleta(String marca, String culoare, float pret, boolean areDiametruRoti, boolean areTipFrana, boolean areCascaDeProtectie, boolean areOchelari) {
        this.marca = marca;
        this.culoare = culoare;
        this.pret = pret;
        this.areDiametruRoti = areDiametruRoti;
        this.areTipFrana = areTipFrana;
        this.areCascaDeProtectie = areCascaDeProtectie;
        this.areOchelari = areOchelari;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bicicleta ");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", areDiametruRoti=").append(areDiametruRoti);
        sb.append(", areTipFrana=").append(areTipFrana);
        sb.append(", areCascaDeProtectie=").append(areCascaDeProtectie);
        sb.append(", areOchelari=").append(areOchelari);
        return sb.toString();
    }
}
