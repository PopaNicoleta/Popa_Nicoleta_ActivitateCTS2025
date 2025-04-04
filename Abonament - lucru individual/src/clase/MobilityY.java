package clase;

public class MobilityY extends Mobility implements Subscription{
    private float tarifTotalGBInternet;

    public MobilityY(String numeClient, String dataNastere, int varsta, float tarifTotalGBInternet, float reducereFidelitate) {
        super(numeClient, dataNastere, varsta, reducereFidelitate);
        this.tarifTotalGBInternet = tarifTotalGBInternet;
    }


    public void setTarifTotalGBInternet(float tarifTotalGBInternet) {
        this.tarifTotalGBInternet = tarifTotalGBInternet;
    }


    @Override
    public float totalCost(int durationInMonths) {
        return this.tarifTotalGBInternet  - super.totalCost(durationInMonths);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" Tip de abonament: ");
        sb.append("MobilityY ");
        sb.append("tarifTotalGBInternet=").append(tarifTotalGBInternet);
        sb.append('}');
        return sb.toString();
    }
}
