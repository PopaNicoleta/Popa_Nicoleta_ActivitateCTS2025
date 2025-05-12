package A14_Template.clase;

public class Pacient {
    private String nume;
    private StarePacient stare;

    public Pacient(String nume, StarePacient stare) {
        this.nume = nume;
        this.stare = stare;
    }

    public String getNume() {
        return nume;
    }

    public StarePacient getStare() {
        return stare;
    }
}
