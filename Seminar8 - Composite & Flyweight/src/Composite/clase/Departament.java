package Composite.clase;
import java.util.ArrayList;
import java.util.List;

public class Departament implements IStructura{
    private List<IStructura> sectii;
    private String nume;

    public Departament(String nume) {
        this.sectii = new ArrayList<IStructura>();
        this.nume = nume;
    }

    @Override
    public void adaugaStructura(IStructura structura) throws Exception {
        this.sectii.add(structura);
    }

    @Override
    public void stergeStructura(IStructura structura) throws Exception {
        this.sectii.remove(structura);
    }

    @Override
    public IStructura getStructura(int index) throws Exception {
        return this.sectii.get(index);
    }

    @Override
    public void descrieStructura() throws Exception {
        System.out.println("Departamentul -> " + this.nume);
        for(IStructura structura: this.sectii){
            structura.descrieStructura();
        }
    }
}
