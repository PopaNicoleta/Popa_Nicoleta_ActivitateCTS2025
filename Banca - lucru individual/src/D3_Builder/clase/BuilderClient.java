package D3_Builder.clase;

public class BuilderClient implements IBuilder {
    private boolean primesteSalariu;
    private boolean areCardAtasat;
    private boolean areInternetBanking;

    public BuilderClient() {
        this.primesteSalariu = false;
        this.areCardAtasat = false;
        this.areInternetBanking = false;
    }

    public BuilderClient(boolean primesteSalariu, boolean areCardAtasat, boolean areInternetBanking) {
        this.primesteSalariu = primesteSalariu;
        this.areCardAtasat = areCardAtasat;
        this.areInternetBanking = areInternetBanking;
    }

    public BuilderClient setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
        return this;
    }

    public BuilderClient setAreCardAtasat(boolean areCardAtasat) {
        this.areCardAtasat = areCardAtasat;
        return this;
    }

    public BuilderClient setAreInternetBanking(boolean areInternetBanking) {
        this.areInternetBanking = areInternetBanking;
        return this;
    }

    @Override
    public Client build(String nume, int varsta) {
        return new Client(nume, varsta, this.primesteSalariu, this.areCardAtasat, this.areInternetBanking);
    }
}
