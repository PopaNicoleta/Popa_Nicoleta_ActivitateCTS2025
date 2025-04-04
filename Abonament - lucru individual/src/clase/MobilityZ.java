package clase;

public class MobilityZ extends Mobility implements Subscription{
    private float costServiciiVoce;
    private float costServiciiDate;
    private float costServiciiTV;

    public MobilityZ(String numeClient, String dataNastere, int varsta, float  costServiciiVoce, float costServiciiDate, float costServiciiTV, float reducereFidelitate) {
        super(numeClient, dataNastere, varsta, reducereFidelitate);
        this.costServiciiVoce = costServiciiVoce;
        this.costServiciiDate = costServiciiDate;
        this.costServiciiTV = costServiciiTV;
    }


    public void setCostServiciiVoce(float costServiciiVoce) {
        this.costServiciiVoce = costServiciiVoce;
    }

    public void setCostServiciiDate(float costServiciiDate) {
        this.costServiciiDate = costServiciiDate;
    }

    public void setCostServiciiTV(float costServiciiTV) {
        this.costServiciiTV = costServiciiTV;
    }

    @Override
    public float totalCost(int durationInMonths) {
        return this.costServiciiVoce + this.costServiciiDate + this.costServiciiTV - super.totalCost(durationInMonths);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" Tip abonament: ");
        sb.append("MobilityZ ");
        sb.append("costServiciiVoce=").append(costServiciiVoce);
        sb.append(", costServiciiDate=").append(costServiciiDate);
        sb.append(", costServiciiTV=").append(costServiciiTV);
        return sb.toString();
    }
}
