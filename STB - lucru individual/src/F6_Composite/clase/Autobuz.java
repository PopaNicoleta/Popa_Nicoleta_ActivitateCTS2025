package F6_Composite.clase;

public interface Autobuz {
    void adaugaAutobuz(Autobuz autobuz) throws Exception;
    void stergeAutobuz(Autobuz autobuz) throws Exception;
    Autobuz getAutobuz(int index) throws Exception;
    void afiseazaDetalii() throws Exception;
}
