package E7_Decorator.clase;

public abstract class BiletDecorat implements Bilet {
    private Bilet bilet;

    public BiletDecorat(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeaza() {
        this.bilet.printeaza();
        printeazaMesaj();
    }
    public abstract void printeazaMesaj();
}
