package A11_Strategy.clase;

public class PlataCard implements Plata{
    @Override
    public void efectueazaPlata(String nume, String prenume, double sumaDePlatit) {
        System.out.println("Clientul " + nume + " " + prenume + " a efectuat o plata de " + sumaDePlatit + " de lei cu cardul!");
    }
}
