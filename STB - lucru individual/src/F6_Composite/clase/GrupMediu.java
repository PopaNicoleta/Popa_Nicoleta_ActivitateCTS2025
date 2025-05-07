package F6_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class GrupMediu implements Autobuz{
    private String producator;
    private String model;
    private int nrLocuri;
    private List<Autobuz> grupuriMici;
    private static final int MAX_LOCURI = 30;

    public GrupMediu(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = Math.min(MAX_LOCURI, nrLocuri);
        this.grupuriMici = new ArrayList<Autobuz>();
    }

    @Override
    public void adaugaAutobuz(Autobuz autobuz) throws Exception {
        this.grupuriMici.add(autobuz);
    }

    @Override
    public void stergeAutobuz(Autobuz autobuz) throws Exception {
        this.grupuriMici.remove(autobuz);
    }

    @Override
    public Autobuz getAutobuz(int index) throws Exception {
        return this.grupuriMici.get(index);
    }

    @Override
    public void afiseazaDetalii() throws Exception {
        System.out.println("    Grup Mediu-> " + this.producator + " " + this.model + " " + this.nrLocuri);
        for(Autobuz autobuz : this.grupuriMici){
            autobuz.afiseazaDetalii();
        }
    }
}
