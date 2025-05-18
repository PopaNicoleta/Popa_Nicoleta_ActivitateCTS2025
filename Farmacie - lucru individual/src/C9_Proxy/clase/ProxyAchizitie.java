package C9_Proxy.clase;

public class ProxyAchizitie implements  Achizitie {

    @Override
    public void vindeMedicament(Client client){
        if(client.isAreReteta()){
            System.out.println("Clientul are reteta. Achizitie finalizata!");
        } else{
            System.out.println("Clientul nu are reteta. Achizitie nefinalizata!");
        }
    }
}
