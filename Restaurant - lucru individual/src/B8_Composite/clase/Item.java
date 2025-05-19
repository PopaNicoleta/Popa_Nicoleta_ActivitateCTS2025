package B8_Composite.clase;

public class Item implements Nivel{
    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNivel(Nivel nivel) throws Exception {
        throw new Exception("Not supported yet.");
    }

    @Override
    public void stergeNivel(Nivel nivel) throws Exception {
        throw new Exception("Not supported yet.");
    }

    @Override
    public Nivel getNivel(int index) throws Exception {
        throw new Exception("Not supported yet.");
    }

    @Override
    public void afiseaza() throws Exception {
        System.out.println("        " + this.nume);
    }
}
