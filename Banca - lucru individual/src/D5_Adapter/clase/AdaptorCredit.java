package D5_Adapter.clase;

public class AdaptorCredit extends CreditLeasing{
    private Credit credit;

    public AdaptorCredit(Client client, String bun, int valoareBun, Credit credit) {
        super(client, bun, valoareBun);
        this.credit = credit;
    }

    public AdaptorCredit(Credit credit) {
        super(credit.getClient(), null, credit.getSuma());
        this.credit = credit;
    }

    @Override
    public void acordaCredit() {
        this.credit.acordaCredit();
    }
}
