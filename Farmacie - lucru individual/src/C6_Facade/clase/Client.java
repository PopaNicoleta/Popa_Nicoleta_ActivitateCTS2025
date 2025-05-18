package C6_Facade.clase;

public class Client {
    private String nume;
    private boolean areCardDeSanatate;

    public Client(String nume, boolean areCardDeSanatate) {
        this.nume = nume;
        this.areCardDeSanatate = areCardDeSanatate;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreCardDeSanatate() {
        return areCardDeSanatate;
    }

    public boolean verificaCardSanatate(){
        if(this.areCardDeSanatate){
            return true;
        }
        return false;
    }
}
