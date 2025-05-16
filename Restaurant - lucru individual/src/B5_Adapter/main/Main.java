package B5_Adapter.main;

import B5_Adapter.clase.AdapterSoft;
import B5_Adapter.clase.SoftBar;
import B5_Adapter.clase.SoftBucatarie;

public class Main {
    public static void main(String[] args){
        SoftBucatarie softBucatarie = new SoftBucatarie("Papanasi", 25);
        softBucatarie.plateste();

        SoftBar softBar = new AdapterSoft(softBucatarie);
        softBar.plateste();

        SoftBar softBar2 = new SoftBar("Tequila", 30);
        softBar2.plateste();
    }
}
