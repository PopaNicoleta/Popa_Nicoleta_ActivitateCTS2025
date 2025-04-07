package Prototype.clase;
import java.util.LinkedHashMap;
import java.util.Map;

public class ConcreteLive implements Live{
    protected String titlu;
    protected String platforma;
    protected int nrViewers;
    protected Map<String, String> comentariiViewers;

    public ConcreteLive(String titlu, String platforma, int nrViewers, Map<String, String> comentariiViewers) {
        this.titlu = titlu;
        this.platforma = platforma;
        this.nrViewers = nrViewers;
        this.comentariiViewers = comentariiViewers;
    }

    public void setComentariiViewers(Map<String, String> comentariiViewers) {
        this.comentariiViewers = comentariiViewers;
    }

    public void setPlatforma(String platforma) {
        this.platforma = platforma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConcreteLive{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", platforma='").append(platforma).append('\'');
        sb.append(", nrViewers=").append(nrViewers);
        sb.append(", comentariiViewers=").append(comentariiViewers);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Live clone() {
        Map<String, String> cloneComentariiViewers = new LinkedHashMap<>();
        cloneComentariiViewers.putAll(comentariiViewers);
        Live live = new ConcreteLive(this.titlu, this.platforma, this.nrViewers, cloneComentariiViewers);
        return live;
    }
}
