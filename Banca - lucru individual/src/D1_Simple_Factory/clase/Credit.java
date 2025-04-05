package D1_Simple_Factory.clase;

public class Credit {
    private String numeClient;
    private double sumaCredit;
    private double valoareRata;

    public Credit(String numeClient, double sumaCredit, double valoareRata) {
        this.numeClient = numeClient;
        this.sumaCredit = sumaCredit;
        this.valoareRata = valoareRata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Cilenul ").append(numeClient)
                .append(" a solicitat un credit in valoare de ")
                .append(sumaCredit)
                .append(" de euro, care va fi achitat in rate in valoare de ")
                .append(valoareRata);
        return sb.toString();
    }
}
