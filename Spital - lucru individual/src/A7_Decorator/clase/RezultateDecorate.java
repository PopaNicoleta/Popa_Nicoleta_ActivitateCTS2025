package A7_Decorator.clase;

public abstract class RezultateDecorate implements Afisare{
    Afisare afisare;

    public RezultateDecorate(Afisare afisare) {
        this.afisare = afisare;
    }

    @Override
    public void afisareRezultate() {
        afisare.afisareRezultate();
        afisareRezultateOnline();
    }

    public abstract void afisareRezultateOnline();
}
