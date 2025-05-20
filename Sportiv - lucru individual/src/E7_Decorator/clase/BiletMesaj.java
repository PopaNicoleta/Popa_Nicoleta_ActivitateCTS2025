package E7_Decorator.clase;

public class BiletMesaj extends BiletDecorat{
    private String numeEchipa;

    public BiletMesaj(Bilet bilet, String numeEchipa) {
        super(bilet);
        this.numeEchipa = numeEchipa;
    }
    @Override
    public void printeazaMesaj() {
        System.out.println("Hai " + this.numeEchipa  + "!");
    }
}
