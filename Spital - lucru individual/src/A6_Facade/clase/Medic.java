package A6_Facade.clase;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public boolean verificaStareGrava(Pacient pacient) {
        if(pacient.getStare().equals("Grava")) {
            return true;
        } else{
            return false;
        }
    }
}
