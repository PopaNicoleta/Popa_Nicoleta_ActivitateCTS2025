package F10_Strategy.clase;

public class PlataSMS implements Plata {

    public PlataSMS() {
    }

    @Override
    public void plateste(double suma) {
        System.out.println("A fost efectuata o plata prin SMS in valoare de " + suma + " de lei.");
    }
}
