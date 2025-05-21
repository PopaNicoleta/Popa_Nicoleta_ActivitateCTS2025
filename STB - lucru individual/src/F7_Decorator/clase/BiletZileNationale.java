package F7_Decorator.clase;

public class BiletZileNationale extends BiletDecorat{

    public BiletZileNationale(Bilet bilet, String mesaj) {
        super(bilet, mesaj);
    }

    @Override
    public void printeazaBiletPersonalizat(String mesaj) {
        System.out.println(mesaj);
    }
}
