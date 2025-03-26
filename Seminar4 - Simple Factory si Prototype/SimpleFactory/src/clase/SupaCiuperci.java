package clase;

public class SupaCiuperci extends Supa {
    private double cantitateCiuperci;

    public double getCantitateCiuperci() {
        return cantitateCiuperci;
    }

    public SupaCiuperci(int gramaj, double pretPerSutaGr, String ingrediente, double cantitateCiuperci) {
        super(gramaj, pretPerSutaGr, ingrediente);
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + (getCantitateCiuperci()/100) * super.getPretPerSutaGr();
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de ciuperci cu cantitatea de " + getCantitateCiuperci() + " este gata!");
    }
}
