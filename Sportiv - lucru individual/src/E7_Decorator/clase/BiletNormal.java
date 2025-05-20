package E7_Decorator.clase;

public class BiletNormal implements Bilet {
    private double pret;

    public BiletNormal(double pret) {
        this.pret = pret;
    }

    @Override
    public void printeaza() {
        System.out.println("Suma bilet: " + this.pret);
    }
}
