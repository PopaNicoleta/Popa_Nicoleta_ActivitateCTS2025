package F5_Facade.clase;

public class UsaMijloc implements Usa {
    @Override
    public void puneInModLiber() {
        System.out.println("Calatorii au deschis usa din mijloc!");
    }

    @Override
    public void deschideFortat() {
        System.out.println("Soferul a deschis usa din mijloc!");
    }
}
