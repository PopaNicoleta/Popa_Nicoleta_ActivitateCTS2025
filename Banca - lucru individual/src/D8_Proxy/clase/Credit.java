package D8_Proxy.clase;

public class Credit implements ICredit {
    private Client client;
    private Moneda moneda;
    private double suma;

    public Credit(Client client, Moneda moneda, double suma) {
        this.client = client;
        this.moneda = moneda;
        this.suma = suma;
    }

    public Client getClient() {
        return client;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public double getSuma() {
        return suma;
    }

    @Override
    public void creeazaCredit() {
        System.out.println("A fost creat un credit pentru clientul cu numele " + this.client.getNume() + "!");
    }
}
