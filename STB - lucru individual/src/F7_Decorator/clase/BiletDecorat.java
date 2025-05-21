package F7_Decorator.clase;

public abstract class BiletDecorat implements Bilet {
    private Bilet bilet;
    private String mesaj;

    public BiletDecorat(Bilet bilet, String mesaj) {
        this.bilet = bilet;
        this.mesaj = mesaj;
    }

    @Override
    public void printeazaBilet() {
        this.bilet.printeazaBilet();
        printeazaBiletPersonalizat(this.mesaj);
    }

    public abstract void printeazaBiletPersonalizat(String mesaj);
}
