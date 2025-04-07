package Builder.clase;

public class SensorBuilder implements Builder {
    private boolean areNivelPM25;
    private boolean areNivelPM1O;
    private boolean areNivelVOC;
    private boolean areNivelCO2;
    private boolean areNivelCO;

    public SensorBuilder() {
        this.areNivelPM25 = false;
        this.areNivelPM1O = false;
        this.areNivelVOC = false;
        this.areNivelCO2 = false;
        this.areNivelCO = false;
    }

    public SensorBuilder(boolean areNivelPM25, boolean areNivelPM1O, boolean areNivelVOC, boolean areNivelCO2, boolean areNivelCO) {
        this.areNivelPM25 = areNivelPM25;
        this.areNivelPM1O = areNivelPM1O;
        this.areNivelVOC = areNivelVOC;
        this.areNivelCO2 = areNivelCO2;
        this.areNivelCO = areNivelCO;
    }

    public SensorBuilder setAreNivelPM25(boolean areNivelPM25) {
        this.areNivelPM25 = areNivelPM25;
        return this;
    }

    public SensorBuilder setAreNivelPM1O(boolean areNivelPM1O) {
        this.areNivelPM1O = areNivelPM1O;
        return this;
    }

    public SensorBuilder setAreNivelVOC(boolean areNivelVOC) {
        this.areNivelVOC = areNivelVOC;
        return this;
    }

    public SensorBuilder setAreNivelCO2(boolean areNivelCO2) {
        this.areNivelCO2 = areNivelCO2;
        return this;
    }

    public SensorBuilder setAreNivelCO(boolean areNivelCO) {
        this.areNivelCO = areNivelCO;
        return this;
    }

    @Override
    public AbstractAirQualitySensor build(double temperatura, double umiditate) {
        return new Sensor(this.areNivelPM25, this.areNivelPM1O, this.areNivelVOC, this.areNivelCO2, this.areNivelCO, temperatura, umiditate);
    }
}
