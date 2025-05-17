package D5_Adapter.clase;

public class CreditLeasing implements AcordaCredit {
    private Client client;
    private String bun;
    private double valoareBun;

    public CreditLeasing(Client client, String bun, double valoareBun) {
        this.client = client;
        this.bun = bun;
        this.valoareBun = valoareBun;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getBun() {
        return bun;
    }

    public void setBun(String bun) {
        this.bun = bun;
    }

    public double getValoareBun() {
        return valoareBun;
    }

    public void setValoareBun(double valoareBun) {
        this.valoareBun = valoareBun;
    }


    @Override
    public void acordaCredit() {
        if(this.client.getVarsta() >= 18){
            System.out.println("Clientului " + this.client.getNume() + " a facut un credit de leasing pentru un bun de tipul " + this.bun + ", in valoare de " + this.valoareBun + ".");
        } else{
            System.out.println("Clientul trebuie sa aiba cel putin 18 ani pentru a face un credit de leasing!");
        }
    }
}
