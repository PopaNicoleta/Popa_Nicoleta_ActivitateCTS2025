package ro.cts.seminar2.clase;

//am facut aceasta clasa deoarece Aplicant incalca regula single responsability
public class RezultatAplicant{
    private static final int PRAG_ACCEPTARE = 80;

    private String verificaRezultatAplicant(Aplicant aplicant) {
        return "Aplicantul " + aplicant.getNume() + " " + aplicant.getPrenume() + (aplicant.getPunctaj() > PRAG_ACCEPTARE ? " a fost acceptat." : " nu a fost acceptat.");
    }

    public void afiseazaRezultatAplicant(Aplicant aplicant) {
        System.out.println(verificaRezultatAplicant(aplicant));
    }

}
