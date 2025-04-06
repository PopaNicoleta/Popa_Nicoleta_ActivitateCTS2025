package E4_Prototype.clase;

import java.util.HashMap;
import java.util.Map;

public class Client extends AClient {

    public Client(String nume, String prenume, String cnp, int varsta, Map<Integer, String> rezervariAnterioare) {
        super(nume, prenume, cnp, varsta, rezervariAnterioare);
    }

    @Override
    public AClient clone() {
        Map<Integer, String> rezervariAnterioareClone = new HashMap<>();
        rezervariAnterioareClone.putAll(rezervariAnterioare);
        return new Client(this.nume, this.prenume, this.cnp, this.varsta, rezervariAnterioareClone);
    }
}
