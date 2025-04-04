package Prototype.clase;
import java.util.HashMap;
import java.util.Map;

public abstract class AReteta {
    protected int nrReteta;
    protected String numeChimist;
    protected Map<String, Double> solutiiSiCantitati;

    public AReteta() {
        this.nrReteta = 1;
        this.numeChimist = "Costel";
        this.solutiiSiCantitati = new HashMap<String, Double>();
        this.solutiiSiCantitati.put("Solutia1", 18.5);
        this.solutiiSiCantitati.put("Solutia2", 22.5);
    }

    public AReteta(int nrReteta, String numeChimist, Map<String, Double> solutiiSiCantitati) {
        if(nrReteta > 0){
            this.nrReteta = nrReteta;
        }else{
            this.nrReteta = 1;
        }

        if(numeChimist.length() > 3){
            this.numeChimist = numeChimist;
        }else{
            this.numeChimist = "Necunoscut";
        }

        if(solutiiSiCantitati != null){
            this.solutiiSiCantitati = solutiiSiCantitati;
        } else{
            this.solutiiSiCantitati.put(" - ", 0.0);
        }
    }

    public void setNrReteta(int nrReteta) {
        this.nrReteta = nrReteta;
    }

    public void setNumeChimist(String numeChimist) {
        this.numeChimist = numeChimist;
    }

    public void setSolutiiSiCantitati(Map<String, Double> solutiiSiCantitati) {
        this.solutiiSiCantitati = solutiiSiCantitati;
    }

    public abstract void descriere();

    public abstract AReteta clone();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta cu numarul ").append(nrReteta)
                .append(" a fost realizata de ").append(numeChimist)
                .append(" si a utilizat solutiile si cantitatile aferente lor: ").append(solutiiSiCantitati);
        return sb.toString();
    }
}
