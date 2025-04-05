package D4_Prototype.clase;

public abstract class AClient {
    protected String nume;
    protected String CNP;
    protected String gen;
    protected int varsta;
    protected double soldCard;

    public AClient() {
        this.nume = "Nume";
        this.CNP = "324424234342";
        this.gen = "feminin";
        this.varsta = 20;
        this.soldCard = 0;
    }

    public AClient(String nume, String CNP, String gen, int varsta, double soldCard) {
        if(nume.length() >= 3){
            this.nume = nume;
        } else{
            this.nume = "nume invalid";
        }

        if(CNP.length() == 13){
            this.CNP = CNP;
        } else{
            this.CNP = "cnp invalid";
        }

        if(gen.equals("feminin") || gen.equals("masculin")){
            this.gen = gen;
        } else{
            this.gen = "gen invalid";
        }

        if(varsta > 18){
            this.varsta = varsta;
        } else{
            this.varsta = 18;
        }

        if(soldCard > 0){
            this.soldCard = soldCard;
        } else{
            this.soldCard = 0;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Datele clientului: ")
                .append("nume: ").append(nume)
                .append(", CNP: ").append(CNP)
                .append(", gen: ").append(gen)
                .append(", varsta: ").append(varsta)
                .append(", sold card: ").append(soldCard)
                .append(" RON.");
        return sb.toString();
    }

    public abstract AClient clone();
}
