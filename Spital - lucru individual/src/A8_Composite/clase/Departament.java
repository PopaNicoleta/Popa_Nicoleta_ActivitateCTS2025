package A8_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Item {
    private String nume;
    private List<Item> itemi;

    public Departament(String nume) {
        this.nume = nume;
        this.itemi = new ArrayList<Item>();
    }

    @Override
    public void adaugaItem(Item item) throws Exception {
        this.itemi.add(item);
    }

    @Override
    public void stergeItem(Item item) throws Exception {
        this.itemi.remove(item);
    }

    @Override
    public Item getItem(int index) throws Exception {
        return this.itemi.get(index);
    }

    @Override
    public void afiseazaItem() throws Exception {
        System.out.println(this.nume);
        for(Item item : this.itemi){
            item.afiseazaItem();
        }
    }
}
