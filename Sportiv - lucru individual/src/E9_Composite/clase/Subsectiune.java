package E9_Composite.clase;

public class Subsectiune implements Loc{
    private String nume;

    public Subsectiune(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaLoc(Loc loc) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public void stergeLoc(Loc loc) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public Loc getLoc(int index) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public void afiseazaDetalii() throws Exception {
        System.out.println("    " + this.nume);
    }
}
