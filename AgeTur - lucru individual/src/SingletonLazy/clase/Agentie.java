package SingletonLazy.clase;

public class Agentie {
    private String nume;
    private int nrAngajati;
    private String adresa;
    private static Agentie instance = null;

    private Agentie(String nume, int nrAngajati, String adresa) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
        this.adresa = adresa;
    }

    public static Agentie getInstance(String nume, int nrAngajati, String adresa){
        if(instance == null){
            instance = new Agentie(nume, nrAngajati, adresa);
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agentia ").append(nume).append(" are un numar de ").append(nrAngajati).append(" angajati si are sediul la adresa ").append(adresa).append(".");
        return sb.toString();
    }
}
