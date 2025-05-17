package F5_Facade.clase;

public class UsaSpate implements Usa{
    @Override
    public void puneInModLiber() {
        System.out.println("Calatorii au deschis usa din fata!");
    }

    @Override
    public void deschideFortat() {
        System.out.println("Soferul a deschis usa din fata!");
    }
}
