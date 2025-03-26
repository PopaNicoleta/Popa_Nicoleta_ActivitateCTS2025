package Builder;

public class Pacient {

    private String nume;
    private String gen;
    private int varsta;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciDeCamera;
    private boolean areHalatPentruInterior;

    public Pacient() {
    }

    public Pacient(String nume, String gen, int varsta, boolean arePatRabatabil, boolean areMicDejunInclus, boolean arePapuciDeCamera, boolean areHalatPentruInterior) {
        this.nume = nume;
        this.gen = gen;
        this.varsta = varsta;
        this.arePatRabatabil = false;
        this.areMicDejunInclus = false;
        this.arePapuciDeCamera = false;
        this.areHalatPentruInterior = false;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public boolean isArePatRabatabil() {
        return arePatRabatabil;
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public boolean isAreMicDejunInclus() {
        return areMicDejunInclus;
    }

    public void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    public boolean isArePapuciDeCamera() {
        return arePapuciDeCamera;
    }

    public void setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
    }

    public boolean isAreHalatPentruInterior() {
        return areHalatPentruInterior;
    }

    public void setAreHalatPentruInterior(boolean areHalatPentruInterior) {
        this.areHalatPentruInterior = areHalatPentruInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacientul/ Pacienta").
                append(" cu numele ").append(nume).
                append(", de gen ").append(gen).
                append(", are ").append(varsta).
                append(" de ani si a optat pentru urmatoarele servicii:").
                append(" are pat rabatabil: ").append(arePatRabatabil).
                append(", are papuci in camera: ").append(arePapuciDeCamera).
                append(", are halat pentru interior: ").append(areHalatPentruInterior).
                append(", are mic dejun inclus: ").append(areMicDejunInclus).append('\'');
        return sb.toString();
    }
}
