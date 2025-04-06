package E3_Builder.clase;

public class BuilderRezervare implements IBuilder {

    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaRacoritoare;
    private boolean areMuzicaAmbientala;
    private String genMuzica;

    public BuilderRezervare() {
        this.areMancareInclusa = false;
        this.areScaunErgonomic = false;
        this.areBauturaRacoritoare = false;
        this.areMuzicaAmbientala = false;
        this.genMuzica = "pop";
    }

    public BuilderRezervare(boolean areMancareInclusa, boolean areScaunErgonomic, boolean areBauturaRacoritoare, boolean areMuzicaAmbientala, String genMuzica) {
        this.areMancareInclusa = areMancareInclusa;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBauturaRacoritoare = areBauturaRacoritoare;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    public BuilderRezervare setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
        return this;
    }

    public BuilderRezervare setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }

    public BuilderRezervare setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
        this.areBauturaRacoritoare = areBauturaRacoritoare;
        return this;
    }

    public BuilderRezervare setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        return this;
    }

    public BuilderRezervare setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    @Override
    public Rezervare build(String numeClient, int nrScaun, String data) {
        return new Rezervare(numeClient, nrScaun, data, this.areMancareInclusa, this.areScaunErgonomic, this.areBauturaRacoritoare, this.areMuzicaAmbientala, this.genMuzica);
    }
}
