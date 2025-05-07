package E9_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Loc {
    String nume;
    List<Loc> subsectiuni;

    public Sectiune(String nume) {
        this.nume = nume;
        this.subsectiuni = new ArrayList<Loc>();
    }

    @Override
    public void adaugaLoc(Loc loc) throws Exception {
        this.subsectiuni.add(loc);
    }

    @Override
    public void stergeLoc(Loc loc) throws Exception {
        this.subsectiuni.remove(loc);
    }

    @Override
    public Loc getLoc(int index) throws Exception {
        return this.subsectiuni.get(index);
    }

    @Override
    public void afiseazaDetalii() throws Exception {
        System.out.println(this.nume);
        for(Loc loc: this.subsectiuni){
            loc.afiseazaDetalii();
        }
    }
}
