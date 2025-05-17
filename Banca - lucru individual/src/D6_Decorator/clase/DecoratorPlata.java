package D6_Decorator.clase;

public abstract class DecoratorPlata implements IPlata{
    private IPlata plata;

    public DecoratorPlata(IPlata plata) {
        this.plata = plata;
    }

    @Override
    public boolean efectueazaPlata() {
        if(this.plata.efectueazaPlata()){
            printeazaModalitate();
            return true;
        }
        else{
            System.out.println("Plata nereusita!");
            return false;
        }
    }

    public abstract void printeazaModalitate();
}
