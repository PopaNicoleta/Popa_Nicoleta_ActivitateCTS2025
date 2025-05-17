package D5_Adapter.clase;

public class Credit implements AcordaCredit{
    private Client client;
    private double suma;

    public Credit(Client client, double suma) {
        this.client = client;
        this.suma = suma;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }


    @Override
    public void acordaCredit() {
        if (this.client.getVarsta() >= 18) {
            System.out.println("Clientului " + this.client.getNume() + " i s-a acordat un credit in valoare de " + this.suma);
        } else {
            System.out.println("Clientul trebuie sa aiba cel putin 18 ani pentru a face un credit!");
        }
    }
}
