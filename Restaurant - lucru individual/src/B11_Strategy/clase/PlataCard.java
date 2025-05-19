package B11_Strategy.clase;

public class PlataCard implements Plata {
    @Override
    public void realizeazaPlata(double suma) {
        System.out.println("A fost efectuata o plata cu cardul in valoare de " + suma + " de lei.");
    }
}
