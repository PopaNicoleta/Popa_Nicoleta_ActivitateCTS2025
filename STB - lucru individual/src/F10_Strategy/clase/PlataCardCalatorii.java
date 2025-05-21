package F10_Strategy.clase;

public class PlataCardCalatorii implements Plata {
    public PlataCardCalatorii() {
    }

    @Override
    public void plateste(double suma) {
        System.out.println("A fost folosita o calatorie de " + suma + " de lei.");

    }
}
