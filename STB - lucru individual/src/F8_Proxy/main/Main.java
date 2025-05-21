package F8_Proxy.main;

import F8_Proxy.clase.Autobuz;
import F8_Proxy.clase.AutobuzProxy;
import F8_Proxy.clase.IAutobuz;

public class Main {
    public static void main(String[] args) {
        IAutobuz autobuz = new Autobuz("N192", "Petre Ispirescu", false);
        autobuz.opresteInStatie();

        System.out.println("");

        IAutobuz autobuzProxy = new AutobuzProxy((Autobuz)autobuz);
        autobuzProxy.opresteInStatie();
    }
}
