package Strategy.clase;

public class PlataCardBancar implements Plata {
    private double sold;

    public PlataCardBancar(double sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(double pretBilet) {
        if(this.sold >= pretBilet) {
            System.out.println("A fost efectuata o plata cu cardul in valoare de " + pretBilet + " de lei cu cardul!");
        }
        else{
            System.out.println("Sold insuficient");
        }
    }
}
