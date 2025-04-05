package D2_Factory_Method.clase;

public class ClientPersoanaJuridica extends Client {
    private int codCAEN;

    public ClientPersoanaJuridica(String nume, String adresa, String dataSemnareContract, int codCAEN) {
        super(nume, adresa, dataSemnareContract);
        this.codCAEN = codCAEN;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("Clientul este o persoana juridica al carei cod CAEN este: ")
                .append(codCAEN)
                .append(".");
        return sb.toString();
    }
}
