package A9_Proxy.main;

import A9_Proxy.clase.Internare;
import A9_Proxy.clase.InternarePacient;
import A9_Proxy.clase.InternareProxy;
import A9_Proxy.clase.Pacient;

public class Main {
    public static void main(String[] args) {

        Pacient pacient1 = new Pacient("Anamaria", 18,false);
        Pacient pacient2 = new Pacient("Maria", 27, true);

        Internare internare = new InternarePacient(pacient1);
        internare.interneaza();

        Internare internareProxy1 = new InternareProxy(pacient2);
        internareProxy1.interneaza();

        Internare internareProxy2 = new InternareProxy(pacient1);
        internareProxy2.interneaza();
    }
}
