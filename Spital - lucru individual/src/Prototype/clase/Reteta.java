package Prototype.clase;

import java.util.Map;

public class Reteta extends AReteta{
    public Reteta() {
    }

    public Reteta(int nrReteta, String numeChimist, Map<String, Double> solutiiSiCantitati) {
        super(nrReteta, numeChimist, solutiiSiCantitati);
    }

    @Override
    public void descriere() {
        System.out.println("Aceasta este o reteta!");
    }

    @Override
    public AReteta clone() {
        Reteta reteta = new Reteta();
        reteta.nrReteta = this.nrReteta;
        reteta.numeChimist = this.numeChimist;
        reteta.solutiiSiCantitati = this.solutiiSiCantitati;
        return reteta;

    }
}
