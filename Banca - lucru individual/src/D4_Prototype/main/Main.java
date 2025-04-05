package D4_Prototype.main;
import D4_Prototype.clase.AClient;
import D4_Prototype.clase.Client;


public class Main {
    public static void main(String[] args) {
        AClient client_1 = new Client("Matei", "3424232323221", "masculin", 37, 21000);
        System.out.println( client_1.toString());

        AClient client_2 = client_1.clone();
        System.out.println(client_2.toString());

        AClient client_3 = client_2.clone();
        System.out.println(client_3.toString());
    }
}