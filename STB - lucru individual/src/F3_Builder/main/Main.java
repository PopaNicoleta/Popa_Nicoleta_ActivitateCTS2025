package F3_Builder.main;

import F3_Builder.clase.AutobuzLinie;
import F3_Builder.clase.BuilderAutobuzLinie;

public class Main {
    public static void main(String[] args) {

        BuilderAutobuzLinie builder = new BuilderAutobuzLinie();
        AutobuzLinie autobuzLinie = builder.setAreOpririLaCapatDeLinie(true).build("Mercedes-Benz", "Costel");
        System.out.println(autobuzLinie.toString());

        AutobuzLinie autobuzLinie1 = builder.setMesajAfisatDerulator("urmeaza statia Piata Unirii").build("Mercedes-Benz","Marian");
        System.out.println(autobuzLinie1.toString());
    }
}