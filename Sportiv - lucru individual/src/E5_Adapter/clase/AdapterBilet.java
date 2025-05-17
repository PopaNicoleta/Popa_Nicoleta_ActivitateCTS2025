package E5_Adapter.clase;

public class AdapterBilet extends BiletOnline {
    private Bilet bilet;

    public AdapterBilet(String numeCumparator, double pret, Bilet bilet) {
        super(numeCumparator, pret);
        this.bilet = bilet;
    }

    public AdapterBilet(Bilet bilet) {
        super(bilet.getNumeCumparator(), bilet.getPret());
        this.bilet = bilet;
    }

    @Override
    public void vindeBilet() {
        bilet.vindeBilet();
    }
}
