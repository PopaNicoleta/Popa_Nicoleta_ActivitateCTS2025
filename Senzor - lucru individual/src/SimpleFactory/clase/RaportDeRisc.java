package SimpleFactory.clase;

public class RaportDeRisc implements AbstractAirQualityReport {
    private int valoareNivelParticuleFine;

    public RaportDeRisc(int valoareNivelParticuleFine) {
        this.valoareNivelParticuleFine = valoareNivelParticuleFine;
    }

    @Override
    public void afiseazaRaport() {
        System.out.println("Raport de risc!! Valoarea nivelului de particule fine este: " +  valoareNivelParticuleFine);

    }
}
