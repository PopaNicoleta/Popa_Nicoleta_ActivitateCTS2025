package B16_Chain_Of_Responsability.main;

import B16_Chain_Of_Responsability.clase.*;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Mariana", null, null);
        Client client2 = new Client("Marina", "0757414757", null);
        Client client3 = new Client("Marius", null, "marius@gmail.com");

        Notificator notificatorSMS = new NotificatorSMS();
        Notificator notificatorMail = new NotificatorMail();
        Notificator notificatorManager = new NotificatorManager();

        notificatorSMS.setUrmatorul(notificatorMail);
        notificatorMail.setUrmatorul(notificatorManager);

        notificatorSMS.notifica(client1, "ai primit un voucher de 10% la urmatoarea masa!");
        notificatorSMS.notifica(client2, "ai primit un voucher de 10% la urmatoarea masa!");
        notificatorSMS.notifica(client3, "ai primit un voucher de 10% la urmatoarea masa!");

    }
}