package clase;

public abstract class Supa {
    private int gramaj;
    private double pretPerSutaGr;
    private String ingrediente;

    public Supa(int gramaj, double pretPerSutaGr, String ingrediente) {
        this.gramaj = gramaj;
        this.pretPerSutaGr = pretPerSutaGr;
        this.ingrediente = ingrediente;
    }

    public int getGramaj() {
        return gramaj;
    }

    public void setGramaj(int gramaj) {
        this.gramaj = gramaj;
    }

    public double getPretPerSutaGr() {
        return pretPerSutaGr;
    }

    public void setPretPerSutaGr(double pretPerSutaGr) {
        this.pretPerSutaGr = pretPerSutaGr;
    }

    public abstract void preparareSupa();

    public double calculeazaPret(){
        return pretPerSutaGr * (gramaj/100);
    }
}
