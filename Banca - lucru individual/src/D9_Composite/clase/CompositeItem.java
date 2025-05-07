package D9_Composite.clase;

public interface CompositeItem extends Item {
    void adaugaItem(Item item) throws Exception;
    void stergeItem(Item item) throws Exception;
    Item getItem(int index) throws Exception;
}
