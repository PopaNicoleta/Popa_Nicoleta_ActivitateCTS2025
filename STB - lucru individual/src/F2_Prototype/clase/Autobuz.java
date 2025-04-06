package F2_Prototype.clase;

public class Autobuz extends AbstractAutobuz{

    public Autobuz(String marca, int anFabricatie, double capacitateMotor, String carburant) {
        super(marca, anFabricatie, capacitateMotor, carburant);
    }

    @Override
    public AbstractAutobuz clone() {
        return new Autobuz(this.marca, this.anFabricatie, this.capacitateMotor, this.carburant);
    }
}
