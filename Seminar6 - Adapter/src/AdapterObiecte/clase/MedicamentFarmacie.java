package AdapterObiecte.clase;

public class MedicamentFarmacie {
    public Object cum;
    private String nume;
    private float pret;
    private boolean esteInStoc;

    public MedicamentFarmacie(String nume, float pret, boolean esteInStoc) {
        this.nume = nume;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
    }

    public void cumparaMedicament(){
        if(esteInStoc){
            System.out.println("A fost cumparat medicamentul " + this.nume + "cu pretul de" + this.pret + " lei");
        } else{
            System.out.println("Medicamentul " + this.nume + " nu este in stoc!");
        }
    }
}
