package E11_Strategy.clase;

public class VerificaBagajeBilet implements Verifica {

    public VerificaBagajeBilet() {
    }

    @Override
    public void verifica() {
        System.out.println("A achizitionat un bilet pentru peluza si a fost verificat pentru bagaje si bilet!");
    }
}
