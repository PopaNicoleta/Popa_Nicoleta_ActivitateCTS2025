package SingletonSerialization.clase;

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

    public static synchronized Agentie getInstance(String nume, int nrAngajati, String adresa){
        if(instance == null){
            instance = new Agentie(nume, nrAngajati, adresa);
        }
        return instance;
    }

    protected Object readResolve(){
        return getInstance("Alta agentie", 12, "Str. Amurgului, Nr. 12");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agentia ").append(nume).append(" are un numar de ").append(nrAngajati).append(" angajati si are sediul la adresa ").append(adresa).append(".");
        return sb.toString();
    }
}
