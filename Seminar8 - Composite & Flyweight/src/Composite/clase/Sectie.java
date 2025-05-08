package Composite.clase;

public class Sectie implements IStructura {
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaStructura(IStructura structura) throws Exception {
        throw new Exception("Not Implemented");
    }

    @Override
    public void stergeStructura(IStructura structura) throws Exception {
        throw new Exception("Not Implemented");
    }

    @Override
    public IStructura getStructura(int index) throws Exception {
        throw new Exception("Not Implemented");
    }

    @Override
    public void descrieStructura() throws Exception {
        System.out.println("    Sectia -> " + this.nume);
    }
}
