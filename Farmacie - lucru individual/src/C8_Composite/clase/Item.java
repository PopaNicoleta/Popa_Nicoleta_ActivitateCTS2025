package C8_Composite.clase;

public interface Item {
    public void adaugaSubsectiune(Item subsectiune) throws Exception;
    public void stergeSubsectiune(Item subsectiune) throws Exception;
    public Item getSubsectiune(int index) throws Exception;
    public void afiseaza();
}
