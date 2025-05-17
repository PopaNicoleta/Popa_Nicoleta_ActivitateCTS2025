package D6_Decorator.clase;

public class PlataOnline extends DecoratorPlata{
    private Client detaliiClient;
    private int suma;

    public PlataOnline(IPlata plata) {
        super(plata);
    }

    public PlataOnline(IPlata plata, Client detaliiClient, int suma) {
        super(plata);
        this.detaliiClient = detaliiClient;
        this.suma = suma;
    }

    public Client getDetaliiClient() {
        return detaliiClient;
    }

    public void setDetaliiClient(Client detaliiClient) {
        this.detaliiClient = detaliiClient;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    @Override
    public void printeazaModalitate() {
        System.out.println("Plata a fost realizata online!");
    }
}
