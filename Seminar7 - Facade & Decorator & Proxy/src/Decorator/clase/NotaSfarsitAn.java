package Decorator.clase;

public class NotaSfarsitAn extends NotaDecorata{

    public NotaSfarsitAn(Nota nota) {
        super(nota);
    }

    @Override
    protected void printeazaFelicitare() {
        System.out.println("Va doresc un an nou fericit!");
    }
}
