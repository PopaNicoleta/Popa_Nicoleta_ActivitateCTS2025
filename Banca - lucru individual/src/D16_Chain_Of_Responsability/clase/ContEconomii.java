package D16_Chain_Of_Responsability.clase;

public class ContEconomii extends Cont{
    public ContEconomii(double sold) {
        super(sold);
    }

    @Override
    public void plateste(double suma) {
        if(suma <= super.getSold()){
            System.out.println("O plata in suma de " + suma + " de lei a fost efectuata cu cardul de economii!");
        } else if (super.getUrmatorul() != null) {
            super.getUrmatorul().plateste(suma);
        } else {
            System.out.println("Plata de " + suma + " RON a fost refuzata! Fonduri insuficiente in toate conturile.");
        }
    }
}
