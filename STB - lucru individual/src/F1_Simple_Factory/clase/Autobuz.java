package F1_Simple_Factory.clase;

import F1_Simple_Factory.factory.TipMijlocTransport;

public class Autobuz extends MijlocTransport{
    private double capacitateMotor;

    public Autobuz(int nrLinie, int nrLocuri, int anFabricatie, double capacitateMotor) {
        super(nrLinie, nrLocuri, anFabricatie);
        this.capacitateMotor = capacitateMotor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(" Tipul mijlocului de transport este autobuz si are un motor cu capacitatea de ")
                .append(capacitateMotor).append(" metrii cubi.");
        return sb.toString();
    }
}
