package E8_Proxy.clase;

public class VanzareBilet implements IVanzare {

    public VanzareBilet() {

    }

    @Override
    public void vindeBilet(Persoana persoana) {
        System.out.println("A fost vandut un bilet lui " + persoana.getNume() + "!");
    }
}
