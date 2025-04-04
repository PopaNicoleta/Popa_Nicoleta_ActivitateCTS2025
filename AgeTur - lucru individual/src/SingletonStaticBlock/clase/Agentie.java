package SingletonStaticBlock.clase;

public class Agentie {
    private String nume;
    private int nrAngajati;
    private String adresa;
    private static Agentie instance = new Agentie();

    private Agentie() {
        this.nume = "AgeTur";
        this.nrAngajati = 12;
        this.adresa = "Str. Amurgului, Nr. 12";
    }

    static{
        try{
            instance = new Agentie();
        }
        catch(Exception e){
            throw new ExceptionInInitializerError("Eroare! Agentia nu a putut fi creata!");
        }
    }

    public static  Agentie getInstance(String nume, int nrAngajati, String adresa){
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
