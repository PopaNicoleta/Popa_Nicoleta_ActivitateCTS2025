package D1_Simple_Factory.clase;

public class CreditIpotecar extends Credit{
    private String adresaImobil;

    public CreditIpotecar(String numeClient, double sumaCredit, double valoareRata, String adresaImobil) {
        super(numeClient, sumaCredit, valoareRata);
        this.adresaImobil = adresaImobil;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(". Tipul creditului este ipotecar si adresa imobilului este: ")
                .append(adresaImobil).append('\'');
        return sb.toString();
    }
}
