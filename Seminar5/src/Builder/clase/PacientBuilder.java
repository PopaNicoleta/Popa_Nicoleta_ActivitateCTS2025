package Builder.clase;

public class PacientBuilder implements AbstractBuilder {
   public Pacient pacient;

    public PacientBuilder(String nume) {
        this.pacient = new Pacient(nume, "Un alt pacient", false, false, false, false);
    }

    public PacientBuilder setNume(String nume){
        this.pacient.setNume(nume);
        return this;
    }

    public PacientBuilder setNumePrieten(String numePrieten){
        this.pacient.setNumePrieten(numePrieten);
        return this;
    }


    public PacientBuilder setAreMicDejunInclus(boolean areMicDejunInclus){
        this.pacient.setAreMicDejunInclus(areMicDejunInclus);
        return this;
    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil){
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    public PacientBuilder setAreHalatPentruInterior(boolean areHalatPentruInterior){
        this.pacient.setAreHalatPentruInterior(areHalatPentruInterior);
        return this;
    }

    public PacientBuilder setArePapuciDeCamera(boolean  arePapuciDeCamera){
        this.pacient.setArePapuciDeCamera(arePapuciDeCamera);
        return this;
    }

    @Override
    public Pacient buildPacient() {
        return this.pacient;
    }
}
