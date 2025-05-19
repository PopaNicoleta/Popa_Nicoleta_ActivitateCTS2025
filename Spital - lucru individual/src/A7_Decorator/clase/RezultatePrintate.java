package A7_Decorator.clase;

import java.util.List;

public class RezultatePrintate implements Afisare{
    private String numePacient;
    private List<Double> valori;

    public RezultatePrintate(String numePacient, List<Double> valori) {
        this.numePacient = numePacient;
        this.valori = valori;
    }

    @Override
    public void afisareRezultate() {
        System.out.println("Printare rezultate");
        System.out.println("Pacient: " + this.numePacient + " -> valori: " + this.valori);
    }
}
