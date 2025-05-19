package B11_Strategy.clase;

public class PlataCash implements Plata {
    @Override
    public void realizeazaPlata(double suma) {
        System.out.println("A fost efectuata o plata in valoare de " + suma + " de lei.");
    }
}
