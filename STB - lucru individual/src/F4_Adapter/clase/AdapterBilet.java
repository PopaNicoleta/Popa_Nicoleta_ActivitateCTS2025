package F4_Adapter.clase;

public class AdapterBilet extends BiletMetrou{
    private BiletTerestru biletTerestru;

    public AdapterBilet(double pret, String termenValiditate) {
        super(pret, termenValiditate);
    }

    public AdapterBilet(BiletTerestru biletTerestru) {
        super(biletTerestru.getPret(), biletTerestru.getTermenValabilitate());
        this.biletTerestru = biletTerestru;
    }

    @Override
    public void cumparaBilet() {
        this.biletTerestru.cumparaBilet();
    }
}
