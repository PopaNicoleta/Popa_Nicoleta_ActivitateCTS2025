package factory;

import clase.Supa;
import clase.SupaCiuperci;
import clase.SupaLegume;
import clase.SupaVita;

public class SupaFactory {
    private int gramaj;
    private double pretPerSutaDeGr;

    public SupaFactory(int gramaj, double pretPerSutaDeGr) {
        this.gramaj = gramaj;
        this.pretPerSutaDeGr = pretPerSutaDeGr;
    }

    public Supa getSupa(TipSupe tip, String ingrediente, double extra){
        return switch (tip) {
            case Legume -> new SupaLegume(gramaj, pretPerSutaDeGr, ingrediente, extra);
            case Vita -> new SupaVita(gramaj, pretPerSutaDeGr, ingrediente, extra);
            case Ciuperci -> new SupaCiuperci(gramaj, pretPerSutaDeGr, ingrediente, extra);
            default -> null;
        };
    }
}
