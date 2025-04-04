package SingletonEager.clase;

public class Agentie {
    private String nume;
    private int nrAngajati;
    private String adresa;
    private static final Agentie instance = new Agentie();

    private Agentie() {
        this.nume = "AgeTur";
        this.nrAngajati = 12;
        this.adresa = "Strada Libertatii, Nr. 1";
    }

    public static Agentie getInstance(String nume, int nrAngajati, String adresa){
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agentia ").append(nume).append(" are un numar de ").append(nrAngajati).append(" angajati si are sediul la adresa ").append(adresa).append(".");
        return sb.toString();
    }
}
