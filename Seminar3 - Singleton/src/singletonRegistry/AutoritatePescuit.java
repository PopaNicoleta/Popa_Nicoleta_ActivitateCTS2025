package singletonRegistry;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AutoritatePescuit {
    private String denumire;
    private String website;
    private int nrAngajati;

    private static AutoritatePescuit instanta = null;

    private AutoritatePescuit(String denumire, String website, int nrAngajati) {
        this.nrAngajati = nrAngajati;
        this.website = website;
        this.denumire = denumire;
    }

    public static AutoritatePescuit getInstance(){
        if(instanta == null){
            instanta = new AutoritatePescuit("Autoritate", "www.autoritate.ro", 10);
        }
        return instanta;
    }
    private static Map<String, Autorizatie> registry = new HashMap<>();

    public static Autorizatie emiteAutorizatie(String numePersoana){
        if(!registry.containsKey(numePersoana)){
            registry.put(numePersoana, new Autorizatie(numePersoana, new Date().toString(), registry.size()+1));
        }
        return registry.get(numePersoana);
    }

}
