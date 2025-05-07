package F6_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class GrupMare implements Autobuz {
    private String producator;
    private String model;
    private int nrLocuri;
    private List<Autobuz> grupuriMedii;
    private static final int MAX_LOCURI = 50;

    public GrupMare(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = Math.min(nrLocuri, MAX_LOCURI);
        this.grupuriMedii = new ArrayList<Autobuz>();
    }

    @Override
    public void adaugaAutobuz(Autobuz autobuz) throws Exception {
        this.grupuriMedii.add(autobuz);
    }

    @Override
    public void stergeAutobuz(Autobuz autobuz) throws Exception {
        this.grupuriMedii.remove(autobuz);
    }

    @Override
    public Autobuz getAutobuz(int index) throws Exception {
        return this.grupuriMedii.get(index);
    }

    @Override
    public void afiseazaDetalii() throws Exception {
        System.out.println("Grup Mare->" +  this.producator + " " + this.model + " " + this.nrLocuri);
        for(Autobuz autobuz : this.grupuriMedii){
            autobuz.afiseazaDetalii();
        }
    }
}
