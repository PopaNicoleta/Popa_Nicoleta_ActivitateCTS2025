package C7_Decorator.clase;

public class BonFelicitare extends BonDecorat{

    public BonFelicitare(Bon bon) {
        super(bon);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Dirigintele farmaciei va ureaza La multi ani!");
    }
}
