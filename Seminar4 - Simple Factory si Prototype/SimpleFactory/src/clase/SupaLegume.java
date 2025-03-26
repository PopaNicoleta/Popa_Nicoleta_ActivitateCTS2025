package clase;

public class SupaLegume extends Supa {
    private double cantitateCrutoane;

    public SupaLegume(int gramaj, double pretPerSutaGr, String ingrediente, double cantitateCrutoane) {
        super(gramaj, pretPerSutaGr, ingrediente);
        this.cantitateCrutoane = cantitateCrutoane;
    }

    public double getCantitateCrutoane() {
        return cantitateCrutoane;
    }

    public void setCantitateCrutoane(double cantitateCrutoane) {
        this.cantitateCrutoane = cantitateCrutoane;
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + 2 * (getCantitateCrutoane()/100) * super.getGramaj();
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de legume cu o cantitate de " + getCantitateCrutoane() + " este gata!");
    }
}
