package C14_Template.clase;

import java.util.List;

public class Reteta{
    private int numarReteta;
    private List<Medicament> medicamente;
    private double sumaDePlata;

    public Reteta(int numarReteta, List<Medicament> medicamente, double sumaDePlata) {
        this.numarReteta = numarReteta;
        this.medicamente = medicamente;
        this.sumaDePlata = sumaDePlata;
    }

    public int getNumarReteta() {
        return numarReteta;
    }

    public List<Medicament> getMedicamente() {
        return medicamente;
    }

    public double getSumaDePlata() {
        return sumaDePlata;
    }
}
