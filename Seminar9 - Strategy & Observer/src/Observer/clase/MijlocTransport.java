package Observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport implements Subiect{
    private int nrLinie;
    private List<Observator> calatori;

    public MijlocTransport(int nrLinie) {
        this.nrLinie = nrLinie;
        this.calatori = new ArrayList<Observator>();
    }

    public int getNrLinie() {
        return nrLinie;
    }

    public List<Observator> getCalatori() {
        return calatori;
    }

    public void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    public void setCalatori(List<Observator> calatori) {
        this.calatori = calatori;
    }

    @Override
    public void adaugaObservator(Observator observator) {
        this.calatori.add(observator);
    }

    @Override
    public void eliminaObservator(Observator observator) {
        this.calatori.remove(observator);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Observator observator : this.calatori){
            observator.primesteMesaj(mesaj);
        }
    }

    public abstract void anuntaPlecare();
}
