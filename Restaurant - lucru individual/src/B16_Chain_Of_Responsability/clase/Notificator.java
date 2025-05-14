package B16_Chain_Of_Responsability.clase;

public abstract class Notificator {
    private Notificator urmatorul;

    public Notificator getUrmatorul() {
        return this.urmatorul;
    }

    public void setUrmatorul(Notificator urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void notifica(Client client, String mesaj);
}
