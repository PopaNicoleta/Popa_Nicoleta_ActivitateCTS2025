package F9_Flyweight.clase;
import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    Map<String, Flyweight> autobuze;

    public Fabrica() {
        this.autobuze = new HashMap<String, Flyweight>();
    }

    public Flyweight getAutobuze(String model, int anFabricatie, int nrLocuri, int nrLinie) {
        String cheie = "" + model + " " + anFabricatie + " " + nrLocuri + " " + nrLinie;
        Flyweight flyweight = this.autobuze.get(cheie);
        if(flyweight == null) {
            flyweight = new AutobuzLinie(model, anFabricatie, nrLocuri, nrLinie);
            this.autobuze.put(cheie, flyweight);
        }
        return flyweight;
    }
}
