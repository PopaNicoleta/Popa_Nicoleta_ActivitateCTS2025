package F2_Prototype.clase;

public abstract class AbstractAutobuz {
    protected String marca;
    protected int anFabricatie;
    protected double capacitateMotor;
    protected String carburant;

    public AbstractAutobuz(String marca, int anFabricatie, double capacitateMotor, String carburant) {
        this.marca = marca;
        this.anFabricatie = anFabricatie;
        this.capacitateMotor = capacitateMotor;
        this.carburant = carburant;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", capacitateMotor=").append(capacitateMotor);
        sb.append(", carburant='").append(carburant).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public abstract AbstractAutobuz clone();
}
