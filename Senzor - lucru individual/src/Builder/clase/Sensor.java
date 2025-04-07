package Builder.clase;

public class Sensor implements AbstractAirQualitySensor {
    private boolean areNivelPM25;
    private boolean areNivelPM1O;
    private boolean areNivelVOC;
    private boolean areNivelCO2;
    private boolean areNivelCO;
    private double nivelTemperatura;
    private double nivelUmiditate;

    public Sensor() {
        this.areNivelPM25 = false;
        this.areNivelPM1O = false;
        this.areNivelVOC = false;
        this.areNivelCO2 = false;
        this.areNivelCO = false;
        this.nivelTemperatura = 0;
        this.nivelUmiditate = 0;
    }

    public Sensor(boolean areNivelPM25, boolean areNivelPM1O, boolean areNivelVOC, boolean areNivelCO2, boolean areNivelCO, double nivelTemperatura, double nivelUmiditate) {
        this.areNivelPM25 = areNivelPM25;
        this.areNivelPM1O = areNivelPM1O;
        this.areNivelVOC = areNivelVOC;
        this.areNivelCO2 = areNivelCO2;
        this.areNivelCO = areNivelCO;
        this.nivelTemperatura = nivelTemperatura;
        this.nivelUmiditate = nivelUmiditate;
    }

    public void setAreNivelPM25(boolean areNivelPM25) {
        this.areNivelPM25 = areNivelPM25;
    }

    public void setAreNivelPM1O(boolean areNivelPM1O) {
        this.areNivelPM1O = areNivelPM1O;
    }

    public void setAreNivelVOC(boolean areNivelVOC) {
        this.areNivelVOC = areNivelVOC;
    }

    public void setAreNivelCO2(boolean areNivelCO2) {
        this.areNivelCO2 = areNivelCO2;
    }

    public void setAreNivelCO(boolean areNivelCO) {
        this.areNivelCO = areNivelCO;
    }

    public void setNivelTemperatura(double nivelTemperatura) {
        this.nivelTemperatura = nivelTemperatura;
    }

    public void setNivelUmiditate(double nivelUmiditate) {
        this.nivelUmiditate = nivelUmiditate;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Senzorul are urmatoarele functionalitati: PM2.5 -> " + this.areNivelPM25 + ", PM10 -> " +
                this.areNivelPM1O + ", VOC -> " + this.areNivelVOC + ", CO2 -> " + this.areNivelCO2 +
                ", C0 -> " + this.areNivelCO + ", Umiditate -> " + this.nivelUmiditate +
                ",  Temperatura -> " + this.nivelTemperatura + ".");
    }
}
