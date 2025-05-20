package E6_Facade.clase;

public class Cazier {
    public boolean esteCautataDepolitie(Client client) {
        if (client.isEsteCautatDePolitie()) {
            return true;
        } else {
            return false;
        }
    }
}
