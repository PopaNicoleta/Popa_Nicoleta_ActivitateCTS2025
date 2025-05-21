package E14_Template.clase;

public class Persoana extends Intrare{
    private String nume;
    private boolean areBilet;

    public Persoana(String nume, boolean areBilet) {
        this.nume = nume;
        this.areBilet = areBilet;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreBilet() {
        return areBilet;
    }

    @Override
    protected void asezareCoada() {
        System.out.println(this.nume + " s-a asezat la coada!");
    }

    @Override
    protected boolean prezintaBilet() {
        if(this.areBilet) {
            return true;
        } else{
            return false;
        }
    }

    @Override
    protected void treceControlCorporal() {
        System.out.println("A trecut de controlul corporal.");
    }

    @Override
    protected void intraInStadion() {
        System.out.println("A intrat in stadion.");
    }

    @Override
    protected void ocupaLoc(int numarLoc) {
        System.out.println("A ocupat locul cu numarul " + numarLoc + ".");
    }
}
