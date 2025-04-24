package Decorator.clase;

public class NotaPaste extends NotaDecorata{
    public NotaPaste(Nota nota) {
        super(nota);
    }

    @Override
    protected void printeazaFelicitare() {
        System.out.println("Paste fericit!");
    }
}
