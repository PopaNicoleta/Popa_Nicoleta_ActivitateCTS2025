package D8_Proxy.clase;

public class ProxyMoneda implements ICredit {
    private Credit credit;

    public ProxyMoneda(Credit credit) {
        this.credit = credit;
    }

    @Override
    public void creeazaCredit(){
        if(credit.getMoneda() != Moneda.RON){
            System.out.println("Banca realizeaza credite DOAR in RON!");
        } else{
            System.out.println("S-a realizat un credit pe numele " + this.credit.getClient().getNume() + ", in valoare de " + this.credit.getSuma() + " de RON.");
        }
    }
}
