package C3_Builder.main;
import C3_Builder.clase.BuilderFactura;
import C3_Builder.clase.Factura;

public class Main {
    public static void main(String[] args) {
        BuilderFactura builder = new BuilderFactura();
        Factura factura = builder.setNrPungi(2).build(12, "Popescu Marcel");
        System.out.println(factura.toString());

        Factura factura2 = builder.setAreCardFidelitate(true).setCotaTva(5).setEstePlataCuCardul(true).build(132, "Pop Costel");
        System.out.println(factura2.toString());

        Factura factura3 = builder.setCotaTva(19).setNrPungi(1).setAreCardFidelitate(true).build(99, "Popa Cristina");
        System.out.println(factura3.toString());
    }
}