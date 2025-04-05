package D2_Factory_Method.clase;

public class ClientPersoanaFizica extends Client{
    private int varsta;

    public ClientPersoanaFizica(String nume, String adresa, String dataSemnareContract, int varsta) {
        super(nume, adresa, dataSemnareContract);
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("Clientul este o persoana fizica, in varsta de ")
                .append(varsta)
                .append(" ani.");
        return sb.toString();
    }
}
