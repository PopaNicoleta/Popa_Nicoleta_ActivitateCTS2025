package Singleton.clase;

public class Service implements IService {
    private String numeService;
    private String adresa;
    private int nrAngajati;
    private AMasina masina;
    private static Service instance = null;

    private Service() {

    }
    private Service(String numeService, String adresa, int nrAngajati, AMasina masina) {
        this.numeService = numeService;
        this.adresa = adresa;
        this.nrAngajati = nrAngajati;
        this.masina = masina;
    }

    public String getNumeService() {
        return numeService;
    }

    public String getAdresa() {
        return adresa;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public AMasina getMasina() {
        return masina;
    }

    public void setMasina(AMasina masina) {
        this.masina = masina;
    }

    public static Service getInstance(String numeService, String adresa, int nrAngajati, AMasina masina) {
        if(instance == null) {
            instance = new Service(numeService, adresa, nrAngajati, masina);
        }
        return instance;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Service-ul " + this.numeService + " are sediul la adresa " +
                this.adresa + ", are un numar de " + this.nrAngajati + " de angajati si, in prezent, are masina " +
                masina.toString() + " la reparat.");
    }
}
