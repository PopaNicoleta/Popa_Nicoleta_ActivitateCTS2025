package E6_Facade.clase;

public class Client {
    private String nume;
    private boolean esteCautatDePolitie;
    private boolean areAntecedente;

    public Client(String nume, boolean esteCautatDePolitie, boolean areAntecedente) {
        this.nume = nume;
        this.esteCautatDePolitie = esteCautatDePolitie;
        this.areAntecedente = areAntecedente;
    }

    public String getNume() {
        return nume;
    }

    public boolean isEsteCautatDePolitie() {
        return esteCautatDePolitie;
    }

    public boolean isAreAntecedente() {
        return areAntecedente;
    }

    public boolean verificaBuletin(String numeDePeBilet){
        if(this.nume.equals(numeDePeBilet)){
            return true;
        } else{
            return false;
        }
    }
}
