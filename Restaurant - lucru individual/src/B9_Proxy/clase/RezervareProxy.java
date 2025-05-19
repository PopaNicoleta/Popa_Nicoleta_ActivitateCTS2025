package B9_Proxy.clase;

public class RezervareProxy implements IRezervare{
    private IRezervare rezervare;

    public RezervareProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare(String nume, int nrPersoane) {
        if(nrPersoane >= 4){
            System.out.println("A fost efectuata o rezervare pe numele " + nume + "!");
        } else{
            System.out.println("Ne pare rau! Rezervarile pot fi facute doar pentru grupuri de cel putin 4 persoane!");
        }
    }
}
