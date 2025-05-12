package Observer.clase;

public interface Subiect {
    public void adaugaObservator(Observator observator);
    public void eliminaObservator(Observator observator);
    public void trimiteNotificare(String mesaj);
}
