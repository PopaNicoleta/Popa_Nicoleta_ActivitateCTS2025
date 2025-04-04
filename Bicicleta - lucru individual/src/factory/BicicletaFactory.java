package factory;

import builderClase.Bicicleta;
import factoryClase.BicicletaElectrica;
import factoryClase.BicicletaMTB;
import factoryClase.BicicletaTrekking;

public class BicicletaFactory {
    public Bicicleta createBicicleta(TipBicicleta tip, String nume, String culoare, float pret, boolean areDiametruRoti, boolean areTipFrana, boolean areCascaDeProtectie, boolean areOchelari, int extra) {
        return switch(tip) {
            case Electrica -> new BicicletaElectrica(nume, culoare, pret, areDiametruRoti, areTipFrana, areCascaDeProtectie, areOchelari, extra);
            case MTB -> new BicicletaMTB(nume, culoare, pret, areDiametruRoti, areTipFrana, areCascaDeProtectie, areOchelari, extra);
            case Trekking -> new BicicletaTrekking(nume, culoare, pret, areDiametruRoti, areTipFrana, areCascaDeProtectie, areOchelari ,extra);
            default -> null;
        };
    }
}
