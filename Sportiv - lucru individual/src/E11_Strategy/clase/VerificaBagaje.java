package E11_Strategy.clase;

public class VerificaBagaje implements Verifica{

    public VerificaBagaje() {
    }

    @Override
    public void verifica() {
        System.out.println("Are un bilet pentru tribuna si a fost verifcat de bagaje");
    }
}
