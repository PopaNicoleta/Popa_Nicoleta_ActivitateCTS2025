package C8_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Item{
    private String nume;
    List<Item> subsectiuni;

    public Sectiune(String nume) {
        this.nume = nume;
        this.subsectiuni = new ArrayList<Item>();
    }

    @Override
    public void adaugaSubsectiune(Item subsectiune){
        this.subsectiuni.add(subsectiune);
    }

    @Override
    public void stergeSubsectiune(Item subsectiune) {
        this.subsectiuni.remove(subsectiune);
    }

    @Override
    public Item getSubsectiune(int index) {
        return this.subsectiuni.get(index);
    }

    @Override
    public void afiseaza() {
        System.out.println("Sectiunea: " + this.nume);
        for(Item subsectiune : this.subsectiuni){
            subsectiune.afiseaza();
        }
    }
}
