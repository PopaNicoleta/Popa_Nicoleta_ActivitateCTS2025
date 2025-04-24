package Facade.clase;

public class Ospatar {

    public Ospatar() {
    }

    public boolean esteAranjata(Masa masa){
       return masa.getNrMasa() % 4 == 0;
    }
}
