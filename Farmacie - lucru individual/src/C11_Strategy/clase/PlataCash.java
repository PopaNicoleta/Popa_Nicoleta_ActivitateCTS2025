package C11_Strategy.clase;

public class PlataCash implements ModPlata {
    private int sumaDinPortofel;

    public PlataCash(int sumaDinPortofel) {
        this.sumaDinPortofel = sumaDinPortofel;
    }

    public int getSumaDinPortofel() {
        return sumaDinPortofel;
    }

    @Override
    public void plateste(double suma) {
        if(this.sumaDinPortofel >= suma){
            this.sumaDinPortofel -= suma;
            System.out.println("A fost efectuata o plata de " + suma + " de lei.");
        } else{
            System.out.println("Clientul nu are suficienti bani la el!");
        }
    }
}
