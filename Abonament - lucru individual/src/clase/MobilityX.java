package clase;

public class MobilityX extends Mobility implements Subscription {
    private float tarifTotalMinute;

    public MobilityX(String numeClient, String dataNastere, int varsta, float tarifTotalMinute , float reducereFidelitate) {
        super(numeClient, dataNastere, varsta, reducereFidelitate);
        this.tarifTotalMinute = tarifTotalMinute;
    }


    public void setTarifTotalMinute(float tarifTotalMinute) {
        this.tarifTotalMinute = tarifTotalMinute;
    }


    @Override
    public float totalCost(int durationInMonths) {
        return this.tarifTotalMinute - super.totalCost(durationInMonths);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" Tip de abonament: ");
        sb.append("MobilityX ");
        sb.append("tarifTotalMinute=").append(tarifTotalMinute);
        sb.append('}');
        return sb.toString();
    }
}
