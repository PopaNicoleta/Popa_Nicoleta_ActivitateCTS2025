package C6_Facade.clase;

import java.util.List;

public class Reteta {
    private int nrReteta;
    private Client client;
    private Medicament medicament;
    private int cantitate;

    public Reteta(int nrReteta, Client client, Medicament medicament, int cantitate) {
        this.nrReteta = nrReteta;
        this.client = client;
        this.medicament = medicament;
        this.cantitate = cantitate;
    }

    public int getNrReteta() {
        return nrReteta;
    }

    public Client getClient() {
        return this.client;
    }

    public Medicament getMedicament() {
        return medicament;
    }

    public int getCantitate() {
        return cantitate;
    }

    public boolean verificaReteta(int nrReteta){
        if(this.nrReteta == nrReteta){
            return true;
        } else{
            return false;
        }
    }
}
