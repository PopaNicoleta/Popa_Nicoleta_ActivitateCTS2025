package E3_Builder.clase;

public class Rezervare {
    private String numeClient;
    private int nrScaun;
    private String data;
    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaRacoritoare;
    private boolean areMuzicaAmbientala;
    private String genMuzica;

    public Rezervare() {
        this.numeClient = "Necunoscut";
        this.nrScaun = 1;
        this.data = "01-01-2025";
        this.areMancareInclusa = false;
        this.areScaunErgonomic = false;
        this.areBauturaRacoritoare = false;
        this.areMuzicaAmbientala = false;
        this.genMuzica = "Necunoscut";
    }

    public Rezervare(String numeClient, int nrScaun, String data, boolean areMancareInclusa, boolean areScaunErgonomic, boolean areBauturaRacoritoare, boolean areMuzicaAmbientala, String genMuzica) {
        this.numeClient = numeClient;
        this.nrScaun = nrScaun;
        this.data = data;
        this.areMancareInclusa = areMancareInclusa;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBauturaRacoritoare = areBauturaRacoritoare;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        if(this.areMuzicaAmbientala == true){
            this.genMuzica = genMuzica;
        } else{
            this.genMuzica = " - ";
        }
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setNrScaun(int nrScaun) {
        this.nrScaun = nrScaun;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
    }

    public void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public void setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
        this.areBauturaRacoritoare = areBauturaRacoritoare;
    }

    public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrScaun=").append(nrScaun);
        sb.append(", data='").append(data).append('\'');
        sb.append(", areMancareInclusa=").append(areMancareInclusa);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areBauturaRacoritoare=").append(areBauturaRacoritoare);
        sb.append(", areMuzicaAmbientala=").append(areMuzicaAmbientala);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
