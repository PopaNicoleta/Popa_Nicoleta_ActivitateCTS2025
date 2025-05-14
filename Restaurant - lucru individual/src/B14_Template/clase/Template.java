package B14_Template.clase;

public abstract class Template {

    public final void ocupaMasa(Rezervare rezervare) {
        curataMasa();
        aseazaServetele();
        aseazaTacamuri();
        if(!invitaPersoane(rezervare.getNrPersoane())){
            System.out.println("Capacitatea maxima a mesei este depasita!");
        }
        else{
            System.out.println("Clientii care au facut rezervarea pe numele " + rezervare.getNume() + ", sunt poftiti sa se aseze la masa!");
        }
    }

    public abstract void curataMasa();
    public abstract void aseazaServetele();
    public abstract void aseazaTacamuri();
    public abstract boolean invitaPersoane(int nrPersoane);
}
