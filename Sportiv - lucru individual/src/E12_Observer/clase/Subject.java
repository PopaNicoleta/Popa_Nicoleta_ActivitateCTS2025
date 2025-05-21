package E12_Observer.clase;

public interface Subject {
    public void trimiteMesaj(String mesaj);
    public void adaugaClient(Observer observer);
    public void stergeClient(Observer observer);
}
