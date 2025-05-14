package B16_Chain_Of_Responsability.clase;

public class NotificatorManager extends Notificator{
    public NotificatorManager() {

    }

    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Domnule manager, nu avem datele necesare pentru a contacta clientul cu numele " + client.getNume());
    }
}
