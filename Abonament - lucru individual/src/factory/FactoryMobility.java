package factory;

import clase.Mobility;
import clase.MobilityX;
import clase.MobilityY;
import clase.MobilityZ;

public class FactoryMobility {
    private String nume;
    private String dataNastere;
    private int varsta;
    private float reducereFidelitate;

    public FactoryMobility(String nume, String dataNastere, int varsta, float reducereFidelitate) {
        this.nume = nume;
        this.dataNastere = dataNastere;
        this.varsta = varsta;
        this.reducereFidelitate = reducereFidelitate;
    }

    public Mobility creazaAbonament(TipAbonament tip, float tarifVoce, float tarifDate, float tarifTV) {
        return switch(tip){
            case MobilityX -> new MobilityX(this.nume, this.dataNastere, this.varsta, tarifVoce, this.reducereFidelitate);
            case MobilityY -> new MobilityY(this.nume, this.dataNastere, this.varsta, tarifDate, this.reducereFidelitate);
            case MobilityZ -> new MobilityZ(this.nume, this.dataNastere, this.varsta, tarifVoce, tarifDate, tarifTV, this.reducereFidelitate);
            default -> null;
        };

    }
}
