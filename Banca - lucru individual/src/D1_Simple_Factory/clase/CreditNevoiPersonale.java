package D1_Simple_Factory.clase;

public class CreditNevoiPersonale extends Credit{
    private String dataIncepere;
    public CreditNevoiPersonale(String numeClient, double sumaCredit, double valoareRata, String dataIncepere) {
        super(numeClient, sumaCredit, valoareRata);
        this.dataIncepere = dataIncepere;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(". Tipul creditului este de nevoi personale si data inceperii achitarii este: ")
                .append(dataIncepere).append('\'');
        return sb.toString();
    }
}
