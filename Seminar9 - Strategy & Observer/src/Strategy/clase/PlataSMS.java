package Strategy.clase;

public class PlataSMS implements Plata {
    @Override
    public void plateste(double sumaDePlata) {
        System.out.println("A fost efectuata o plata prin SMS in valoare de " + sumaDePlata + ".");
    }
}
