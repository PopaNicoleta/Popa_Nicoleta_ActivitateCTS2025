package Strategy.clase;

public class PlataCardCalatorii implements Plata {
    private int nrCalatorii;

    public PlataCardCalatorii(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void plateste(double pretBilet) {
        if(this.nrCalatorii == 0){
            System.out.println(" A fost facuta o plata de " + pretBilet + " de lei cu cardul de cal");
        }
        else{
            System.out.println("Nu este necesara achizitionarea unui bilet! Mai ai " + this.nrCalatorii + " calatorii.");
            this.nrCalatorii--;
        }
    }
}
