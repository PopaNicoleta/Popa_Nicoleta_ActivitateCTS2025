package C8_Composite.clase;

public class Subsectiune implements Item{
    private String nume;
    private int varstaMinAdministrare;

    public Subsectiune(String nume, int varstaMinAdministrare) {
        this.nume = nume;
        this.varstaMinAdministrare = varstaMinAdministrare;
    }

    @Override
    public void adaugaSubsectiune(Item subsectiune) throws Exception {
        throw new Exception("Not supported yet.");
    }

    @Override
    public void stergeSubsectiune(Item subsectiune) throws Exception {
        throw new Exception("Not supported yet.");
    }

    @Override
    public Subsectiune getSubsectiune(int index) throws Exception {
        throw new Exception("Not supported yet.");
    }

    @Override
    public void afiseaza() {
        System.out.println("    Subcategoria: " + this.nume + ", varsta minima de administrare: " +this.varstaMinAdministrare);
    }
}
