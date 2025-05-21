package E14_Template.clase;

public abstract class Intrare {
    protected abstract void asezareCoada();
    protected abstract boolean prezintaBilet();
    protected abstract void treceControlCorporal();
    protected abstract void intraInStadion();
    protected abstract void ocupaLoc(int numarLoc);

    public final void intraSiOcupa(int numarLoc){
        asezareCoada();
        if(prezintaBilet()){
            treceControlCorporal();
            intraInStadion();
            ocupaLoc(numarLoc);
        } else{
            System.out.println("Nu poate intra in stadion deoarece nu a achizitionat niciun bilet!");
        }
    }
}
