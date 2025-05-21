package E11_Strategy.clase;

public class VerificaBilet implements Verifica {

    public VerificaBilet() {
    }

    @Override
    public void verifica() {
        System.out.println("A cumparat un bilet pentru tribuna VIP si a fost verificat doar pe baza biletului");
    }
}
