package factoryClase;

import builderClase.Bicicleta;

public class BicicletaTrekking extends Bicicleta {
    private int greutate;

    public BicicletaTrekking(String marca, String culoare, float pret, boolean areDiametruRoti, boolean areTipFrana, boolean areCascaDeProtectie, boolean areOchelari, int greutate) {
        super(marca, culoare, pret, areDiametruRoti, areTipFrana, areCascaDeProtectie, areOchelari);
        this.greutate = greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", tip bicicleta= ");
        sb.append("BicicletaTrekking ");
        sb.append(", greutate=").append(greutate);
        return sb.toString();
    }
}
