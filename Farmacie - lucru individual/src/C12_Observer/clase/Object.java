package C12_Observer.clase;

public interface Object {
    public void adaugaClient(Observer client);
    public void eliminaClient(Observer client);
    public void anunta(String mesaj);
}
