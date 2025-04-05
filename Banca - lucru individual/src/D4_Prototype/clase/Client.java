package D4_Prototype.clase;


public class Client extends AClient{

    public Client() {

    }

    public Client(String nume, String CNP, String gen, int varsta, double soldCard) {
        super(nume, CNP, gen, varsta, soldCard);
    }

    @Override
    public AClient clone() {
        Client client = new Client();
        client.nume = this.nume;
        client.CNP = this.CNP;
        client.varsta = this.varsta;
        client.gen = this.gen;
        client.soldCard = this.soldCard;
        return client;
    }
}
