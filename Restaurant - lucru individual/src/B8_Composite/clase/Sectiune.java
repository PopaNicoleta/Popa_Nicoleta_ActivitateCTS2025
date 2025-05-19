package B8_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Nivel {
    private String nume;
    private List<Nivel> subsectiuni;

    public Sectiune(String nume) {
        this.nume = nume;
        this.subsectiuni = new ArrayList<Nivel>();
    }

    @Override
    public void adaugaNivel(Nivel nivel) throws Exception {
        this.subsectiuni.add(nivel);
    }

    @Override
    public void stergeNivel(Nivel nivel) throws Exception {
        this.subsectiuni.remove(nivel);
    }

    @Override
    public Nivel getNivel(int index) throws Exception {
        return this.subsectiuni.get(index);
    }

    @Override
    public void afiseaza() throws Exception {
        System.out.println(this.nume);
        for(Nivel nivel : this.subsectiuni){
            nivel.afiseaza();
        }
    }
}
