package F7_Decorator.clase;

public class BiletBasic implements Bilet {
    private double suma;

    public BiletBasic(double suma) {
        this.suma = suma;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Valoare bilet: " + this.suma + " de lei.");
    }
}
