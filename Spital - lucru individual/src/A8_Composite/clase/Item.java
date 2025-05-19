package A8_Composite.clase;

public interface Item {
    public void adaugaItem(Item item) throws Exception;
    public void stergeItem(Item item) throws Exception;
    public Item getItem(int index) throws Exception;
    public void afiseazaItem() throws Exception;
}
