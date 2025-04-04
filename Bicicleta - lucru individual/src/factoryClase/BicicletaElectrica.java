package factoryClase;

import builderClase.Bicicleta;

public class BicicletaElectrica extends Bicicleta {
    private int kmAutonomie;

    public BicicletaElectrica(String marca, String culoare, float pret, boolean areDiametruRoti, boolean areTipFrana, boolean areCascaDeProtectie, boolean areOchelari, int kmAutonomie) {
        super(marca, culoare, pret, areDiametruRoti, areTipFrana, areCascaDeProtectie, areOchelari);
        this.kmAutonomie = kmAutonomie;
    }

    public void setCapacitateVW(int kmAutonomie) {
        this.kmAutonomie = kmAutonomie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", tip bicileta= ");
        sb.append("BicicletaElectrica=");
        sb.append(", kmAutonomie=").append(kmAutonomie);
        return sb.toString();
    }
}
