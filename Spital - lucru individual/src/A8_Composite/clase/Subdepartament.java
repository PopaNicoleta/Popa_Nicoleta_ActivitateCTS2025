package A8_Composite.clase;

public class Subdepartament implements Item {
    private String nume;

    public Subdepartament(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaItem(Item item) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public void stergeItem(Item item) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public Item getItem(int index) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public void afiseazaItem() throws Exception {
        System.out.println("    " + this.nume);
    }
}
