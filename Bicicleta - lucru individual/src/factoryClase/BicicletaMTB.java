package factoryClase;

import builderClase.Bicicleta;

public class BicicletaMTB extends Bicicleta{
    private int anAparitie;

    public BicicletaMTB(String marca, String culoare, float pret, boolean areDiametruRoti, boolean areTipFrana, boolean areCascaDeProtectie, boolean areOchelari, int anAparitie) {
        super(marca, culoare, pret, areDiametruRoti, areTipFrana, areCascaDeProtectie, areOchelari);
        this.anAparitie = anAparitie;
    }

    public void setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", tip bicicleta= ");
        sb.append("BicicletaMTB");
        sb.append(", anAparitie=").append(anAparitie);
        return sb.toString();
    }
}
