package D2_Factory_Method.clase;

public class Client {
    private String nume;
    private String adresa;
    private String dataSemnareContract;

    public Client(String nume, String adresa, String dataSemnareContract) {
        this.nume = nume;
        this.adresa = adresa;
        this.dataSemnareContract = dataSemnareContract;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Clientul ").append(nume).append(", domiciliat/ avand sediul la adresa: ").append(adresa)
                .append(", a semnat contractul in data de ").append(dataSemnareContract)
                .append(". ");
        return sb.toString();
    }
}
