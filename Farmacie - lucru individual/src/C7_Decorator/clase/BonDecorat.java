package C7_Decorator.clase;

public abstract class BonDecorat implements Bon{
    private Bon bon;

    public BonDecorat(Bon bon) {
        this.bon = bon;
    }

    @Override
    public void printeazaBon() {
        bon.printeazaBon();
        printeazaFelicitare();
    }
    public abstract void printeazaFelicitare();
}
