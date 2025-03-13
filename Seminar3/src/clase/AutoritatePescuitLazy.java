package clase;

public class AutoritatePescuitLazy {
    private String denumire;
    private String website;
    private int nrAngajati;
    private int nrAutorizatiiEmise;
    private static AutoritatePescuitLazy instanta = null;

    private AutoritatePescuitLazy(String denumire, String website, int nrAngajati, int nrAutorizatiiEmise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiiEmise = nrAutorizatiiEmise;
    }

    public synchronized static AutoritatePescuitLazy getInstance(String denumire, String website, int nrAngajati, int nrAutorizatiiEmise) {
        if(instanta == null){
            instanta = new AutoritatePescuitLazy(denumire, website, nrAngajati, nrAutorizatiiEmise);
        }
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
        final StringBuilder sb = new StringBuilder("AutoritatePescuitLazy{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrAutorizatiiEmise=").append(nrAutorizatiiEmise);
        sb.append('}');
        return sb.toString();
    }
}
