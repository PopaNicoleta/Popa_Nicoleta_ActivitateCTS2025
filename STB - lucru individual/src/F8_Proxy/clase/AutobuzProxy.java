package F8_Proxy.clase;

public class AutobuzProxy implements IAutobuz {
    private Autobuz autobuz;

    public AutobuzProxy(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if(this.autobuz.isSuntPersoaneInStatie()){
            this.autobuz.opresteInStatie();
        } else{
            System.out.println("Autobuzul " + this.autobuz.getNumarAutobuz() + " se va retrage la autobaza!");
        }
    }
}
