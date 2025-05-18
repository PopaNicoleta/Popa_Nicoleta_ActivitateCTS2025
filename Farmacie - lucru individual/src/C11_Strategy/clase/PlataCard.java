package C11_Strategy.clase;

public class PlataCard implements ModPlata {
    private double sold;

    public PlataCard(double sold) {
        this.sold = sold;
    }

    public double getSold() {
        return sold;
    }

    @Override
    public void plateste(double suma) {
        if(sold >= suma){
            sold -=suma;
            System.out.println("A fost efectuata o plata cu cardul de " + suma + " de lei.");
        } else{
            System.out.println("Sold insuficient!");
        }
    }

}
