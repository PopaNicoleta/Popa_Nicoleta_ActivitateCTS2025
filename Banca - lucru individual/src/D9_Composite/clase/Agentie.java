package D9_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements CompositeItem{
    String nume;
    List<Item> filiale;

    public Agentie(String nume) {
        this.nume = nume;
        this.filiale = new ArrayList<Item>();
    }

    @Override
    public void adaugaItem(Item item) {
        this.filiale.add(item);
    }

    @Override
    public void stergeItem(Item item) {
        this.filiale.remove(item);
    }

    @Override
    public Item getItem(int index){
        return this.filiale.get(index);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("    " + this.nume);
        for(Item item : this.filiale){
           item.afiseazaDetalii();
        }
    }
}
