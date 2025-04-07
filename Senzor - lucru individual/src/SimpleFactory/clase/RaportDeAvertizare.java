package SimpleFactory.clase;

public class RaportDeAvertizare implements AbstractAirQualityReport {
    private int valoareNivelParticuleFine;

    public RaportDeAvertizare(int valoareNivelParticuleFine) {
        this.valoareNivelParticuleFine = valoareNivelParticuleFine;
    }

    @Override
    public void afiseazaRaport() {
        System.out.println("Raport de avertizare! Valoarea nivelului de particule fine este: " +  valoareNivelParticuleFine);

    }
}
