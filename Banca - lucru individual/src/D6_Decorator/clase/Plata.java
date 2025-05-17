package D6_Decorator.clase;

public class Plata implements IPlata{
    private Client detaliiClient;
    private int suma;

    public Plata(Client detaliiClient, int suma) {
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
    public boolean efectueazaPlata() {
        if(this.detaliiClient.getSold() >= this.suma){
            System.out.println(this.detaliiClient.getNume() + " a efectuat o plata in valoare de " + suma + " de lei.");
            return true;
        } else{
            System.out.println("Sold insuficient! Tranzactia a esuat deoarece soldul cardului este mai mic decat suma tranzactiei!");
            return false;
        }
    }
}
