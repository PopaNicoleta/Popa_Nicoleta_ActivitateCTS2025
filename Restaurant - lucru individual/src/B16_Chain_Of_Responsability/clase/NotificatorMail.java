package B16_Chain_Of_Responsability.clase;

public class NotificatorMail extends Notificator{
    public NotificatorMail() {
    }

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getMail() != null) {
            System.out.println(client.getNume() + ", te anuntam prin acest mail ca " + mesaj);
        } else{
            super.getUrmatorul().notifica(client, mesaj);
        }
    }
}
