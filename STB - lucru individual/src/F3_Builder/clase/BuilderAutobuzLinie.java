package F3_Builder.clase;

public class BuilderAutobuzLinie implements IBuilder {
    private boolean areOpririLaCapatDeLinie;
    private boolean deschideUsile;
    private String mesajAfisatDerulator;

    public BuilderAutobuzLinie() {
        this.areOpririLaCapatDeLinie = false;
        this.deschideUsile = false;
        this.mesajAfisatDerulator = "";
    }

    public BuilderAutobuzLinie(boolean areOpririLaCapatDeLinie, boolean deschideUsile, String mesajAfisatDerulator) {
        this.areOpririLaCapatDeLinie = areOpririLaCapatDeLinie;
        this.deschideUsile = deschideUsile;
        this.mesajAfisatDerulator = mesajAfisatDerulator;
    }

    public BuilderAutobuzLinie setAreOpririLaCapatDeLinie(boolean areOpririLaCapatDeLinie) {
        this.areOpririLaCapatDeLinie = areOpririLaCapatDeLinie;
        return this;
    }

    public BuilderAutobuzLinie setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
        return this;
    }

    public BuilderAutobuzLinie setMesajAfisatDerulator(String mesajAfisatDerulator) {
        this.mesajAfisatDerulator = mesajAfisatDerulator;
        return this;
    }

    @Override
    public AutobuzLinie build(String modelAutobuz, String sofer) {
        return new AutobuzLinie(modelAutobuz, sofer, this.areOpririLaCapatDeLinie, this.deschideUsile, this.mesajAfisatDerulator);
    }
}
