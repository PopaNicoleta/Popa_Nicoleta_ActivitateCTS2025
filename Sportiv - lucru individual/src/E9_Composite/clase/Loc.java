package E9_Composite.clase;

public interface Loc {
    void adaugaLoc(Loc loc) throws Exception;
    void stergeLoc(Loc loc) throws Exception;
    Loc getLoc(int index) throws Exception;
    void afiseazaDetalii() throws Exception;
}
