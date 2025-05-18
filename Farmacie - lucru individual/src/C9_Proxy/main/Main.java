package C9_Proxy.main;

import C9_Proxy.clase.Achizitie;
import C9_Proxy.clase.Client;
import C9_Proxy.clase.ProxyAchizitie;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Grigore Anastasia", "45353363453", false);

        Achizitie proxyAchizitie = new ProxyAchizitie();
        proxyAchizitie.vindeMedicament(client);

    }
}
