package D3_Builder.main;
import D3_Builder.clase.BuilderClient;
import D3_Builder.clase.Client;


public class Main {
    public static void main(String[] args) {

        BuilderClient builder = new BuilderClient();
        Client client_1 = builder.setAreCardAtasat(true).build("Marina", 23);
        System.out.println(client_1.toString());

        Client client_2 = builder.setAreInternetBanking(true).build("Cornel", 47);
        System.out.println(client_2.toString());
    }
}