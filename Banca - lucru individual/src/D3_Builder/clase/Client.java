package D3_Builder.clase;

public class Client {
    private String nume;
    private int varsta;
    private boolean primesteSalariu;
    private boolean areCardAtasat;
    private boolean areInternetBanking;

    public Client(String nume, int varsta, boolean primesteSalariu, boolean areCardAtasat, boolean areInternetBanking) {
        this.nume = nume;
        this.varsta = varsta;
        this.primesteSalariu = primesteSalariu;
        this.areCardAtasat = areCardAtasat;
        this.areInternetBanking = areInternetBanking;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
    }

    public void setAreCardAtasat(boolean areCardAtasat) {
        this.areCardAtasat = areCardAtasat;
    }

    public void setAreInternetBanking(boolean areInternetBanking) {
        this.areInternetBanking = areInternetBanking;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Clientul ")
                .append(nume)
                .append(", in varsta de ")
                .append(varsta)
                .append(" ani, are urmatoarele informatii referitoare la cardul sau: ")
                .append("primeste salariul pe card -> ").append(primesteSalariu)
                .append(", are un card atasat -> ").append(areCardAtasat)
                .append(", are Internet Banking -> ").append(areInternetBanking);
        return sb.toString();
    }
}
