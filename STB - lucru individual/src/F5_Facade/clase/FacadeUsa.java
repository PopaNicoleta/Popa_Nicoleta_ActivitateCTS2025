package F5_Facade.clase;

import com.sun.source.tree.NewArrayTree;

public class FacadeUsa {
    private UsaFata usaFata;
    private UsaMijloc usaMijloc;
    private UsaSpate usaSpate;

    public FacadeUsa() {
        this.usaFata = new UsaFata();
        this.usaMijloc = new UsaMijloc();
        this.usaSpate = new UsaSpate();
    }

    public void deschideToateUsile(){
        this.usaFata.deschideFortat();
        this.usaMijloc.deschideFortat();
        this.usaSpate.deschideFortat();
    }
}
