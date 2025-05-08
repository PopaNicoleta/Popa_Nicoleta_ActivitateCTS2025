package Composite.clase;

public interface IStructura {
    void adaugaStructura(IStructura structura) throws Exception;
    void stergeStructura(IStructura structura) throws Exception;
    IStructura getStructura(int index) throws Exception;
    void descrieStructura() throws Exception;
}
