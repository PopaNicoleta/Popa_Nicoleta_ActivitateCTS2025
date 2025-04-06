package F3_Builder.clase;

public class AutobuzLinie {
    private String modelAutobuz;
    private String sofer;
    private boolean areOpririLaCapatDeLinie;
    private boolean deschideUsile;
    private String mesajAfisatDerulator;

    public AutobuzLinie(String modelAutobuz, String sofer, boolean areOpririLaCapatDeLinie, boolean deschideUsile, String mesajAfisatDerulator) {
        this.modelAutobuz = modelAutobuz;
        this.sofer = sofer;
        this.areOpririLaCapatDeLinie = areOpririLaCapatDeLinie;
        this.deschideUsile = deschideUsile;
        this.mesajAfisatDerulator = mesajAfisatDerulator;
    }

    public void setModelAutobuz(String modelAutobuz) {
        this.modelAutobuz = modelAutobuz;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    public void setAreOpririLaCapatDeLinie(boolean areOpririLaCapatDeLinie) {
        this.areOpririLaCapatDeLinie = areOpririLaCapatDeLinie;
    }

    public void setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("modelAutobuz='").append(modelAutobuz).append('\'');
        sb.append(", sofer='").append(sofer).append('\'');
        sb.append(", areOpririLaCapatDeLinie=").append(areOpririLaCapatDeLinie);
        sb.append(", deschideUsile=").append(deschideUsile);
        sb.append(", mesajAfisatDerulator='").append(mesajAfisatDerulator).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setMesajAfisatDerulator(String mesajAfisatDerulator) {
        this.mesajAfisatDerulator = mesajAfisatDerulator;
    }
}
