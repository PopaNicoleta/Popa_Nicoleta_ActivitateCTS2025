package A12_Observer.subiect;

import A12_Observer.observer.Observer;

public interface Subiect {
    public void adaugaAbonat(Observer abonat);
    public void eliminaAbonat(Observer abonat);
    public void trimiteNotificare(String mesaj);
}
