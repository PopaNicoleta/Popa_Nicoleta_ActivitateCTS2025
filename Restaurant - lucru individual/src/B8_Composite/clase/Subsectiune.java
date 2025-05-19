package B8_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Subsectiune implements Nivel {
    private String nume;
    private List<Nivel> itemi;

    public Subsectiune(String nume) {
        this.nume = nume;
        this.itemi = new ArrayList<Nivel>();
    }

    @Override
    public void adaugaNivel(Nivel nivel) throws Exception {
        this.itemi.add(nivel);
    }

    @Override
    public void stergeNivel(Nivel nivel) throws Exception {
        this.itemi.remove(nivel);
    }

    @Override
    public Nivel getNivel(int index) throws Exception {
        return this.itemi.get(index);
    }

    @Override
    public void afiseaza() throws Exception {
        System.out.println("    " + this.nume);
        for(Nivel nivel : this.itemi){
            nivel.afiseaza();
        }
    }
}
