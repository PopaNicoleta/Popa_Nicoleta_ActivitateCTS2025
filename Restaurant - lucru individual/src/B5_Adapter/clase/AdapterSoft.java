package B5_Adapter.clase;

public class AdapterSoft extends SoftBar{
    private SoftBucatarie softBucatarie;

    public AdapterSoft(String bautura, double pret) {
        super(bautura, pret);
    }

    public AdapterSoft(SoftBucatarie softBucatarie) {
        super(softBucatarie.getPreparat(), softBucatarie.getPret());
        this.softBucatarie = softBucatarie;
    }

    public void plateste(){
        softBucatarie.plateste();
    }
}
