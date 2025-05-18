package C10_Flyweight.clase;

public class Client implements Detalii {
    private String nume;
    private int numarAsigurare;
    private int varsta;

    public Client(String nume, int numarAsigurare, int varsta) {
        this.nume = nume;
        this.numarAsigurare = numarAsigurare;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public int getNumarAsigurare() {
        return numarAsigurare;
    }

    public int getVarsta() {
        return varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clientul ");
        sb.append(nume);
        sb.append(", cu numarul de asigurare: ").append(numarAsigurare);
        sb.append(" a achizitionat reteta -> ");
        return sb.toString();
    }

    @Override
    public void afiseazaDetaliiAchizitii(Reteta reteta) {
        System.out.println(this.toString() + reteta.toString());
    }
}
