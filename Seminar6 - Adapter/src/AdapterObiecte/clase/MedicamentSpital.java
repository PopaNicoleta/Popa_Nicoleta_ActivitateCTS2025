package AdapterObiecte.clase;

public class MedicamentSpital {
    private String nume;
    private float pret;

    public MedicamentSpital(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }

    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println("Si a fost afizitionat la pretul de " + this.pret);
    }

    public void prezintaReteta(){
        System.out.println("Este prezentata reteta pentru medicamentul " + this.nume + ".");
    }
}
