package B16_Chain_Of_Responsability.clase;

public class NotificatorSMS extends Notificator {
    public NotificatorSMS() {
    }

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getNrTelefon() != null) {
            System.out.println(client.getNume() + ", te anuntam prin acest SMS ca " + mesaj);
        } else{
            super.getUrmatorul().notifica(client, mesaj);
        }
    }
}
