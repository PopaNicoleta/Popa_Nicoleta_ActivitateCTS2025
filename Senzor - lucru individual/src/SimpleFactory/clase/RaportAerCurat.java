package SimpleFactory.clase;

public class RaportAerCurat implements AbstractAirQualityReport {
    private int valoareNivelParticuleFine;

    public RaportAerCurat(int valoareNivelParticuleFine) {
        this.valoareNivelParticuleFine = valoareNivelParticuleFine;
    }

    @Override
    public void afiseazaRaport() {
        System.out.println("Raport aer curat! Valoarea nivelului de particule fine este: " +  valoareNivelParticuleFine);

    }
}
