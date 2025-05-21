package F10_Strategy.clase;

public class PlataCardBancar implements Plata {
    public PlataCardBancar() {
    }

    @Override
    public void plateste(double suma) {
        System.out.println("A fost efectuata o plata cu cardul bancar in valoare de " + suma + " de lei.");

    }
}
