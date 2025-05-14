package B14_Template.clase;

public class Masa extends Template{
    private int nrMasa;
    private int capacitate;

    public Masa(int nrMasa, int capacitate) {
        this.nrMasa = nrMasa;
        this.capacitate = capacitate;
    }

    public int getCapacitate() {
        return capacitate;
    }

    @Override
    public void curataMasa() {
        System.out.println("Masa a fost curatata!");
    }

    @Override
    public void aseazaServetele() {
        System.out.println("S-au asezat servetelele pe masa!");
    }

    @Override
    public void aseazaTacamuri() {
        System.out.println("S-au asezat tacamurile pe masa!");

    }

    @Override
    public boolean invitaPersoane(int nrPersoane) {
        if(nrPersoane < this.capacitate){
            return true;
        }
        return false;
    }
}
