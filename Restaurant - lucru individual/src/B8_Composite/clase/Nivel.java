package B8_Composite.clase;

public interface Nivel {
    public void adaugaNivel(Nivel nivel) throws Exception;
    public void stergeNivel(Nivel nivel) throws Exception;
    public Nivel getNivel(int index) throws Exception;
    public void afiseaza() throws Exception;
}
