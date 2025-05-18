package C9_Proxy.clase;

public class AchizitieMedicament implements Achizitie {
    @Override
    public void vindeMedicament(Client client) {
        System.out.println("Achizitie finalizata!");
    }
}
