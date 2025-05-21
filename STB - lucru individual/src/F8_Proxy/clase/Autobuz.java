package F8_Proxy.clase;

public class Autobuz implements IAutobuz {
    private String numarAutobuz;
    private String numeStatie;
    private boolean suntPersoaneInStatie;

    public Autobuz(String numarAutobuz, String numeStatie, boolean suntPersoaneInStatie) {
        this.numarAutobuz = numarAutobuz;
        this.numeStatie = numeStatie;
        this.suntPersoaneInStatie = suntPersoaneInStatie;
    }

    public String getNumarAutobuz() {
        return numarAutobuz;
    }

    public String getNumeStatie() {
        return numeStatie;
    }

    public boolean isSuntPersoaneInStatie() {
        return suntPersoaneInStatie;
    }

    @Override
    public void opresteInStatie(){
        System.out.println("Autobuzul " + this.numarAutobuz + " a oprit in statia " + this.numeStatie + ".");
    }
}
