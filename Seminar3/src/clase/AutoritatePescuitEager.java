package clase;

public class AutoritatePescuitEager {
    private String denumire;
    private String website;
    private int nrAngajati;
    private int nrAutorizatiiEmise;
    private static AutoritatePescuitEager instanta = new AutoritatePescuitEager("ANPA", "ANPA.RO", 20, 12);

    private AutoritatePescuitEager(String denumire, String website, int nrAngajati, int nrAutorizatiiEmise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiiEmise = nrAutorizatiiEmise;
    }

    public static AutoritatePescuitEager getInstance() {
        return instanta;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int angajeaza(int nrAngajati) {
        return this.nrAngajati +=nrAngajati;
    }

    public int concediaza(int nrAngajati) {
       return this.nrAutorizatiiEmise -= nrAngajati;
    }

    public void emiteAutorizatie(String numePersoana){
        System.out.println("A fost emisa o autorizatie pentru "+numePersoana);
        this.nrAutorizatiiEmise +=1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritatePescuitEager{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrAutorizatiiEmise=").append(nrAutorizatiiEmise);
        sb.append('}');
        return sb.toString();
    }
}
