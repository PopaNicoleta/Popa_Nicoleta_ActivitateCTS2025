package C6_Facade.clase;

public class Medicament {
    private int id;
    private String nume;
    private int stoc;

    public Medicament(int id, String nume, int stoc) {
        this.id = id;
        this.nume = nume;
        this.stoc = stoc;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public int getStoc() {
        return stoc;
    }

    public boolean verificaStoc(int cantitate) {
        if(this.stoc > cantitate){
            return true;
        } else{
            return false;
        }
    }
}
