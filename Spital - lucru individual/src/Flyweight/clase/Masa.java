package Flyweight.clase;

public class Masa implements Flyweight {
    private int nrMasa;
    private int nrPersoane;
    private String oraRezervare;
    private String dataRezervare;

    public Masa(int nrMasa, int nrPersoane, String oraRezervare, String dataRezervare) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
        this.dataRezervare = dataRezervare;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public String getOraRezervare() {
        return oraRezervare;
    }

    public void setOraRezervare(String oraRezervare) {
        this.oraRezervare = oraRezervare;
    }

    public String getDataRezervare() {
        return dataRezervare;
    }

    public void setDataRezervare(String dataRezervare) {
        this.dataRezervare = dataRezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("A rezervat masa");
        sb.append(" cu numarul ").append(nrMasa);
        sb.append(" pentru un un numar de ").append(nrPersoane).append(" persoane");
        sb.append(", ora: ").append(oraRezervare);
        sb.append(", in data de ").append(dataRezervare);
        return sb.toString();
    }

    @Override
    public void efectueazaRezervare(Client client) {
        System.out.println(this.toString() + client.toString());
    }

}
