package E8_Proxy.clase;

public class VanzareBiletProxy implements IVanzare {
    private IVanzare vanzareBilet;

    public VanzareBiletProxy(IVanzare vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    @Override
    public void vindeBilet(Persoana persoana) {
        if(persoana.getVarsta() >= 14){
            vanzareBilet.vindeBilet(persoana);
        } else{
            System.out.println("Nu putem vinde bilete persoanelor mai mici de 14 ani!");
        }
    }
}
