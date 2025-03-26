package Builder;

public class PacientBuilder implements IBuilder {

    private Pacient pacient;

    public PacientBuilder(){
        pacient = new Pacient();
    }

    public PacientBuilder setNume(String nume){
        pacient.setNume(nume);
        return this;
    }

    public PacientBuilder setGen(String gen){
        pacient.setGen(gen);
        return this;
    }

    public PacientBuilder setVarsta(int varsta){
        pacient.setVarsta(varsta);
        return this;
    }

    public PacientBuilder setPatRabatabil(boolean patRabatabil){
        pacient.setArePatRabatabil(patRabatabil);
        return this;
    }

    public PacientBuilder setMicDejunInclus(boolean micDejunInclus){
        pacient.setAreMicDejunInclus(micDejunInclus);
        return this;
    }

    public PacientBuilder setPapuciDeCamera(boolean papuciDeCamera){
        pacient.setArePapuciDeCamera(papuciDeCamera);
        return this;
    }

    public PacientBuilder setAreHalatPentruInterior(boolean halatPentruInterior){
        pacient.setAreHalatPentruInterior(halatPentruInterior);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }
}
