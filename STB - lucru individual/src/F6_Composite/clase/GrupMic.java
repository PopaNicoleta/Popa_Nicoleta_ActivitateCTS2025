package F6_Composite.clase;

public class GrupMic implements Autobuz {
    private String producator;
    private String model;
    private int nrLocuri;
    private static final int MAX_LOCURI = 10;

    public GrupMic(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = Math.min(MAX_LOCURI, nrLocuri);
    }

    @Override
    public void adaugaAutobuz(Autobuz autobuz) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public void stergeAutobuz(Autobuz autobuz) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public Autobuz getAutobuz(int index) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public void afiseazaDetalii() throws Exception {
        System.out.println("        Grup Mic-> " + this.producator + " " + this.model +  " " + this.nrLocuri);
    }
}
