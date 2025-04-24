package Decorator.clase;

public class NotaCraciun extends NotaDecorata{
    public NotaCraciun(Nota nota) {
        super(nota);
    }

    @Override
    protected void printeazaFelicitare() {
        System.out.println("Craciun Fericit!");
    }
}
