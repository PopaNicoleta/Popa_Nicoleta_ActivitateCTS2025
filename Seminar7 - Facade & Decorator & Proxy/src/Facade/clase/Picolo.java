package Facade.clase;

public class Picolo {

    public Picolo() {
    }

    public boolean debaraseaza(Masa masa){
        return masa.getNrMasa() % 2 == 0;
    }
}
