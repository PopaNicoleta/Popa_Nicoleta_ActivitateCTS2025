package E11_Strategy.clase;

public class Spectator {
    private String nume;
    private Verifica modVerificare;

    public Spectator(String nume) {
        this.nume = nume;
        this.modVerificare = new VerificaBilet();
    }

    public String getNume() {
        return nume;
    }

    public void setModVerificare(Verifica modVerificare) {
        this.modVerificare = modVerificare;
    }

    public void verificare(){
        this.modVerificare.verifica();
    }

}
