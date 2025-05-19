package A7_Decorator.clase;

public class RezultateOnline extends RezultateDecorate{
    public RezultateOnline(Afisare afisare) {
        super(afisare);
    }

    @Override
    public void afisareRezultateOnline() {
        System.out.println("Rezultatele au fost afisate online!");
    }
}
