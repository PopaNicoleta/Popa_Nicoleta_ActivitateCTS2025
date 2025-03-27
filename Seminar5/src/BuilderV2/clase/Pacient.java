package BuilderV2.clase;

public class Pacient {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciDeCamera;
    private boolean areHalatDeInterior;
    private String numeInsotitor;

    protected Pacient(String nume, boolean arePatRabatabil, boolean areMicDejunInclus, boolean arePapuciDeCamera, boolean areHalatDeInterior, String numeInsotitor) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuciDeCamera = arePapuciDeCamera;
        this.areHalatDeInterior = areHalatDeInterior;
        this.numeInsotitor = numeInsotitor;
    }

    protected void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    protected void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    protected void setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
    }

    protected void setAreHalatDeInterior(boolean areHalatDeInterior) {
        this.areHalatDeInterior = areHalatDeInterior;
    }

    protected void setNumeInsotitor(String numeInsotitor) {
        this.numeInsotitor = numeInsotitor;
    }

    protected void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", arePatRabatabil=" + arePatRabatabil +
                ", areMicDejunInclus=" + areMicDejunInclus +
                ", arePapuciDeCamera=" + arePapuciDeCamera +
                ", areHalatDeInterior=" + areHalatDeInterior +
                ", numeInsotitor='" + numeInsotitor + '\'' +
                '}';
    }
}
