package clase;

public class SupaVita extends Supa{
    private double pretSmantana;

    public SupaVita(int gramaj, double pretPerSutaGr, String ingrediente, double pretSmantana) {
        super(gramaj, pretPerSutaGr, ingrediente);
        this.pretSmantana = pretSmantana;
    }

    public double getPretSmantana() {
        return pretSmantana;
    }

    public void setPretSmantana(double pretSmantana) {
        this.pretSmantana = pretSmantana;
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + pretSmantana;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de vita cu smantana  cu pretul de " + getPretSmantana() + " este gata!");
    }
}
